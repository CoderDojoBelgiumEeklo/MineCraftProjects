import {Component} from '@angular/core';
import {SiteLocalStorageService} from './home/localstorage/sitelocalstorage.Service';

@Component({
  selector: 'pm-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  public _opened: boolean = true;
  public _mode: string = 'push';
  public _position: string = 'left';

  constructor (private _slls: SiteLocalStorageService) { }

}

