import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {IMenu} from '../menu/menu';
import {catchError, tap} from 'rxjs/operators';
import * as showdown from 'showdown';
import * as lightboxExtension from 'src/assets/showdown_lightBoxExtension.js';
import {PageSelectorService} from '../pageselector.service';


declare var lightboxExtension: any;

@Injectable({
  providedIn: 'root'
})
export class MarkdownService {
  private mdBaseUrl: string = 'api';
  private html: string;
  private converter: showdown.Converter;

  constructor(private http: HttpClient, private pageSelector: PageSelectorService) {
    showdown.extension('LightBox', lightboxExtension);
    this.converter = new showdown.Converter({extensions: ['LightBox']});
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
