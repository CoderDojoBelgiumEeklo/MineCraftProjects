import {
  AfterViewInit,
  Compiler,
  Component,
  ComponentFactoryResolver,
  Injector, Input,
  NgModule,
  NgModuleRef,
  ViewChild,
  ViewContainerRef
} from '@angular/core';
import {MarkdownService} from '../shared/markdown/markdown.service';
import {CommonModule} from '@angular/common';
import {PageSelectorService} from '../shared/pageselector.service';
import {CarouselItem} from './carousel/carouselItem';
import {DomSanitizer} from '@angular/platform-browser';
import {TranslationHelperService} from '../shared/translation/translationhelper.service';


@Component({
  selector: 'pm-a-component',
  template: '' +
    '<div #vc></div>'
})

export class OTFAComponent implements  AfterViewInit{
  @ViewChild('vc', {read: ViewContainerRef}) _container: ViewContainerRef;

  constructor(private _compiler: Compiler,
              private _injector: Injector,
              private _m: NgModuleRef<any>,
              private markdownService: MarkdownService,
              private pageSelectorService: PageSelectorService,
              private translationhelperService: TranslationHelperService
              ) {

  }

  private template;

  tmpModule: any;

  ngAfterViewInit() {
    this.RefreshFile();
    this.pageSelectorService.change.subscribe(
      refresh => { this.RefreshFile(); });
    this.translationhelperService.change.subscribe(
      refresh => {this.RefreshFile(); });
  }

  OnTheflyComponent() {

    const tmpCmp = Component({template: this.template})(class {});

    @Component({
      selector: 'pm-carousel',
      templateUrl: './carousel/carousel.component.html'
    })
    class CarouselComponent {
      @Input() ImageLinks: CarouselItem [];

      constructor(private sanitizer: DomSanitizer) {

      }


      getImg(index: number) {
        return this.sanitizer.bypassSecurityTrustUrl(this.ImageLinks[index].url);
      }
    }


    this.tmpModule = NgModule( {declarations: [tmpCmp, CarouselComponent],  imports: [CommonModule], exports: [CommonModule], entryComponents: []})(class {
    });
    this._compiler.clearCacheFor(this.tmpModule);
    this._compiler.compileModuleAndAllComponentsAsync(this.tmpModule)
      .then((factories) => {
        const f = factories.componentFactories[0];
        const cmpRef = f.create(this._injector, [], null, this._m);
        this._container.clear();
        this._container.insert(cmpRef.hostView);
      });
    this._compiler.clearCacheFor(this.tmpModule);
  }



  RefreshFile() {
    this.template = this.markdownService.getMarkdownFile().subscribe(
      data =>  {
              this.template = this.markdownService.getMarkdown(data);
              this.OnTheflyComponent();
            },
      error => { this.markdownService.handleError(error); }
    );
  }

}
