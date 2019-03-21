import { Injectable} from '@angular/core';
import {LocalStorageService} from '../../shared/localstorage/localstorage.service';
import {SiteKeys} from './sitekeys';

@Injectable({
  providedIn: 'root'
})
export class SiteLocalStorageService {

   constructor (private _lss: LocalStorageService) {
  }

  public getStorageSupported(): boolean {
    return this._lss.IsStorageSupported;
  }

  public SaveSiteData(key: SiteKeys, data: string) {
    this._lss.SaveSetting(SiteKeys[key], data);
  }

  public LoadSiteData(key: SiteKeys) {
    return this._lss.RetrieveSetting(SiteKeys[key]);
  }


}
