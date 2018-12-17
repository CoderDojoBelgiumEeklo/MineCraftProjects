import {EventEmitter, Injectable, Output} from '@angular/core';
import {ILanguage} from './language';

@Injectable({
  providedIn: 'root'
})
export class TranslationHelperService {

  Languages: ILanguage[];

  currentLanguage: ILanguage;

  @Output() change: EventEmitter<boolean> = new EventEmitter();

  constructor () {
    this.Languages = [{id: 0, value: 'Nederlands', abbreviation: 'nl'},
                      {id: 1, value: 'English', abbreviation: 'en'},
                      {id: 2, value: 'français', abbreviation: 'fr'}];
    this.currentLanguage = this.Languages[0];
  }


  ChangeLanguage(newLanguage: number) {
    this.currentLanguage = this.Languages[newLanguage];
    this.change.emit(true);
  }

}
