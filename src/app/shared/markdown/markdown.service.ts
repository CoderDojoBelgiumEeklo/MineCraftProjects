import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import * as showdown from 'showdown';
import {PageSelectorService} from '../pageselector.service';
import {YtplayermarkdownService} from './ytplayermarkdown.service';
import {CarouselmarkdownService} from './carouselmarkdown.service';
import {LlService} from './ll.service';
import {LrService} from './lr.service';
import {CarouselImageLinkCreatorService} from './carouselImageLinkCreator.service';
import {EscapeSanitizerService} from './escapeSanitizer.service';
import {LlTextManipulationService} from './llTextManipulation.service';



@Injectable({
  providedIn: 'root'
})
export class MarkdownService {
  private mdBaseUrl: string = 'api';
  private html: string;
  private converter: showdown.Converter;

  constructor(private http: HttpClient, private pageSelector: PageSelectorService, private cilc: CarouselImageLinkCreatorService,
              private ytplayerMarkdown: YtplayermarkdownService, private esz: EscapeSanitizerService,
              private carouselMarkdown: CarouselmarkdownService,
              private llService: LlService, private lrSevice: LrService, private lltm: LlTextManipulationService) {
    showdown.extension('carousel', carouselMarkdown.getMarkdownExtension(cilc));
    showdown.extension('ytplayer', ytplayerMarkdown.getMarkdownExtension());
    showdown.extension('ll', llService.getMarkdownExtension(cilc, esz, lltm));
    showdown.extension('lr', lrSevice.getMarkdownExtension(cilc, esz, lltm));
    this.converter = new showdown.Converter({extensions: ['carousel', 'ytplayer',  'll', 'lr']});
  }

  getMarkdownFile() {
    this.html = this.mdBaseUrl + this.pageSelector.getActivePage();
    return this.http.get(this.html, {responseType: 'text'});
  }

  getMarkdown(content: string) {
    return this.converter.makeHtml(content);
  }


  public handleError(err: HttpErrorResponse) {
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = `An error occurred: ${err.error.message}`;
    } else {
      errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
    }
    console.log(errorMessage);
    // return throwError('ErrorMessage');
  }

}
