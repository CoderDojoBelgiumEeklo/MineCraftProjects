import {EventEmitter, Injectable, Output} from '@angular/core';

@Injectable({
    providedIn: 'root'
  })
export class LocalStorageService {

  public readonly IsStorageSupported: boolean;

  constructor () {
    if (typeof(Storage) !== 'undefined') {
      this.IsStorageSupported = true;
    } else {
      this.IsStorageSupported = false;
    }
  }

  SaveSetting(key: string, value: string)  {
    localStorage.setItem(key, value);
  }

  RetrieveSetting(key: string): string  {
     return localStorage.getItem(key);
  }

}
