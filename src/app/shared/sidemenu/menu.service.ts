import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {IMenu} from './menu';
import {catchError, tap} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class MenuService {
  private menuUrl: string = 'api/menu/menu.json';

  constructor(private http: HttpClient) {
  }

  getMenuStructure(): Observable<IMenu[]> {
    return  this.http.get<IMenu[]>(this.menuUrl).pipe(
      tap(data => console.log('loaded')),
      catchError(this.handleError));
  }

  private handleError(err: HttpErrorResponse) {
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = `An error occurred: ${err.error.message}`;
    } else {
      errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
    }
    console.log(errorMessage);
    return throwError('ErrorMessage');
  }



}
