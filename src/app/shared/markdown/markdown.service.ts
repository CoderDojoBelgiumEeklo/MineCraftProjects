import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import * as showdown from 'showdown';
import {PageSelectorService} from '../pageselector.service';
import {YtplayermarkdownService} from './ytplayermarkdown.service';
import {CarouselmarkdownService} from './carouselmarkdown.service';
import {ImagemarkdownService} from './imagemarkdown.service';



@Injectable({
  providedIn: 'root'
})
export class MarkdownService {
  private mdBaseUrl: string = 'api';
  private html: string;
  private converter: showdown.Converter;

  constructor(private http: HttpClient, private pageSelector: PageSelectorService, private ytplayerMarkdown: YtplayermarkdownService,
              private carouselMarkdown: CarouselmarkdownService, private imageMarkdown: ImagemarkdownService) {
    showdown.extension('carousel', carouselMarkdown.getMarkdownExtension());
    showdown.extension('ytplayer', ytplayerMarkdown.getMarkdownExtension());
    showdown.extension('image', imageMarkdown.getMarkdownExtension());
    this.converter = new showdown.Converter({extensions: ['carousel', 'ytplayer', 'image']});
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
