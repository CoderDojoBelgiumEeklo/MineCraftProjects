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


    class Guid {
      public static newGuid(): Guid {
        return new Guid('xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, c => {
          const r = Math.random() * 16 | 0;
          const v = (c === 'x') ? r : (r & 0x3 | 0x8);
          return v.toString(16);
        }));
      }
      public static get empty(): string {
        return '00000000-0000-0000-0000-000000000000';
      }
      public get empty(): string {
        return Guid.empty;
      }
      public static isValid(str: string): boolean {
        const validRegex = /^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$/i;
        return validRegex.test(str);
      }
      private value: string = this.empty;
      constructor(value?: string) {
        if (value) {
          if(Guid.isValid(value)) {
            this.value = value;
          }
        }
      }
      public toString() {
        return this.value;
      }

      public toJSON(): string {
        return this.value;
      }
    }

    @Component({
      selector: 'pm-carousel',
      templateUrl: './carousel/carousel.component.html'
    })
    class CarouselComponent {
      @Input() ImageLinks: CarouselItem [];

      public id: string;

      constructor(private sanitizer: DomSanitizer) {
        this.id = 'id' + Guid.newGuid();
      }


      getImg(index: number) {
        return this.sanitizer.bypassSecurityTrustUrl(this.ImageLinks[index].url);
      }


    }

    @Component({
      selector: 'pm-ytplayer',
      template: '<div id="CenterWrapper"><iframe [src]="getVideoUrl()" frameborder="0" width="700" height="315"  allowfullscreen></iframe></div>'
    })
    class YtPlayerComponent {
      @Input() VideoLink: CarouselItem;

      constructor(private sanitizer: DomSanitizer) {

      }

      getVideoUrl()   {
        return this.sanitizer.bypassSecurityTrustResourceUrl(this.VideoLink.url.replace('watch?v=', 'embed/'));
      }
    }



    this.tmpModule = NgModule( {declarations: [tmpCmp, CarouselComponent, YtPlayerComponent],  imports: [CommonModule], exports: [CommonModule], entryComponents: []})(class {
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
