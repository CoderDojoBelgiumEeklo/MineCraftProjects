import {Injectable, OnInit} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {IMenu} from './menu';
import {catchError, tap} from 'rxjs/operators';
import {ITranslation} from './translation';
import {PageSelectorService} from '../pageselector.service';


@Injectable({
  providedIn: 'root'
})
export class MenuService {
  private menuUrl: string = 'api/menu/menu.json';

  currentMenu: IMenu[];
  errorMessage: string = '';

  path: number[];
  pageIndex: number;

  backTranslationDutch: ITranslation = {TranslationId: 1, Value: 'Terug'};
  backTranslationEnglish: ITranslation = {TranslationId: 2, Value: 'Back'};
  backTranslationFrench: ITranslation = {TranslationId: 3, Value: 'Retourner'};
  backTranslation: ITranslation[] = [this.backTranslationDutch, this.backTranslationEnglish, this.backTranslationFrench]
  backMenu: IMenu = {
    id: -1,
    link: '',
    submenu: null,
    translation: this.backTranslation,
    icon: 'fa fa-chevron-circle-left'
  };

  constructor(private http: HttpClient,
              private pageSelection: PageSelectorService) {
    this.init();
  }

  public getActiveMenuPart(): any {
    return new Observable(observer => {
        this.getMenuStructure().subscribe(
          menu => {
            let addBackMenu: boolean = false;
            let indexToProcess: number = -1;
            let link: string;
            this.currentMenu = menu;

            for (let index = 0; this.path.length > index; index++) {
              if (index === 0) {
                console.log('Menu init');
              } else {
                let hasSubmenu: boolean = false;
                let isPage: boolean = false;
                for (let indexTempMenu = 0; this.currentMenu.length > indexTempMenu; indexTempMenu++) {
                  hasSubmenu = false;
                  if (this.currentMenu [indexTempMenu].id === this.path[index]) {
                    link = this.currentMenu [indexTempMenu].link;
                    if (this.currentMenu [indexTempMenu].submenu != null) {
                      this.currentMenu = this.currentMenu [indexTempMenu].submenu;
                      addBackMenu = true;
                      hasSubmenu = true;
                      indexToProcess = indexTempMenu;
                      break;
                    }
                  }
                }
                if (link != null) {
                  this.pageSelection.setActivePage(link);
                  isPage = true;
                }
                if (!hasSubmenu && isPage) {
                  this.pageIndex = this.path.pop();
                }
              }
            }

            if (addBackMenu) {
              this.currentMenu.unshift(this.backMenu);
            }

            observer.next(this.currentMenu);
          },
          error => this.errorMessage = <any>error);
      }
    );
  }

  init() {
    this.path = [];
    this.path.push(0);
  }

  private getMenuStructure(): Observable<IMenu[]> {
    return this.http.get<IMenu[]>(this.menuUrl).pipe(
      tap(data => console.log('loaded')),
      catchError(this.handleError));
  }


  MoveMenu(id: number) {
    if (id === this.backMenu.id) {
      this.path.pop();
    } else {
      this.path.push(id);
    }
    console.log(this.path);
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
