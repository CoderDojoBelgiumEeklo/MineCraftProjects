import {EventEmitter, Injectable, Output} from '@angular/core';
import {ILanguage} from './language';
import {SiteLocalStorageService} from '../../home/localstorage/sitelocalstorage.Service';
import {SiteKeys} from '../../home/localstorage/sitekeys';

@Injectable({
  providedIn: 'root'
})
export class TranslationHelperService {

  Languages: ILanguage[];

  currentLanguage: ILanguage;

  @Output() change: EventEmitter<boolean> = new EventEmitter();

  constructor (private _slss: SiteLocalStorageService) {
    this.Languages = [{id: 0, value: 'Nederlands', abbreviation: 'nl'},
                      {id: 1, value: 'English', abbreviation: 'en'},
                      {id: 2, value: 'français', abbreviation: 'fr'}];
    this.currentLanguage = this.Languages[0];
    if ( this._slss.getStorageSupported()) {
      this.ChangeLanguage(parseInt(this._slss.LoadSiteData(SiteKeys.LastLanguage), 10));
    }
  }


  ChangeLanguage(newLanguage: number) {
    this.currentLanguage = this.Languages[newLanguage];
    this._slss.SaveSiteData(SiteKeys.LastLanguage, this.currentLanguage.id.toString() )
    this.change.emit(true);
  }

}
