import {Injectable, SecurityContext} from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';

@Injectable({
 providedIn: 'root'
})
export class EscapeSanitizerService {

  constructor(private _sanitizer: DomSanitizer) {

  }

  public  escapeAndSantizeCode(unsafe: string){
    return this._sanitizer.sanitize(SecurityContext.SCRIPT, this.escapeString(unsafe));
  }

  escapeString(unsafe: string) {
    return unsafe
      .replace(/&/g, '&amp;')
      .replace(/</g, '&lt;')
      .replace(/>/g, '&gt;')
      .replace(/"/g, '&quot;')
      .replace(/'/g, '\\\'');
  }

}
