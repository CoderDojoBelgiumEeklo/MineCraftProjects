import {EventEmitter, Injectable, Output} from '@angular/core';
import {TranslationHelperService} from './translation/translationhelper.service';

@Injectable({
  providedIn: 'root'
})
export class PageSelectorService {
  private _activePage: string;

  @Output() change: EventEmitter<boolean> = new EventEmitter();

  constructor(private translationHelper: TranslationHelperService) {
    this._activePage = 'welcome.' + this.translationHelper.currentLanguage.abbreviation + '.md';
  }

  getActivePage() {
    return this._activePage;
  }

  setActivePage(newlink: string) {
    this._activePage = newlink;
    this.change.emit(true);
  }


}
