import {EventEmitter, Injectable, Output} from '@angular/core';
import {TranslationHelperService} from './translation/translationhelper.service';
import {SiteLocalStorageService} from '../home/localstorage/sitelocalstorage.Service';
import {SiteKeys} from '../home/localstorage/sitekeys';

@Injectable({
  providedIn: 'root'
})
export class PageSelectorService {
  private _activePage: string;

  @Output() change: EventEmitter<boolean> = new EventEmitter();

  constructor(private translationHelper: TranslationHelperService,
              private _slss: SiteLocalStorageService) {
    this._activePage = '/welcome';
    if (this._slss.getStorageSupported()) {
      const page = this._slss.LoadSiteData(SiteKeys.LastPage);
      if (typeof page !== null && page)       {
        this.setActivePage(page);
      }

    }
  }

  getActivePage() {
    return this._activePage + '.'  + this.translationHelper.currentLanguage.abbreviation + '.md';
  }


  setActivePage(newlink: string) {
    this._activePage = newlink;
    this._slss.SaveSiteData(SiteKeys.LastPage, newlink);
    this.change.emit(true);
  }


}
