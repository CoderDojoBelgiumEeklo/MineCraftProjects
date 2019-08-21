import {Component, OnInit} from '@angular/core';
import {SiteLocalStorageService} from './home/localstorage/sitelocalstorage.Service';
import {CarouselImageLinkCreatorService} from './shared/markdown/carouselImageLinkCreator.service';


@Component({
  selector: 'pm-root',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit{
  public _opened: boolean = true;
  public _mode: string = 'push';
  public _position: string = 'left';

  constructor (private _slls: SiteLocalStorageService, private cilc: CarouselImageLinkCreatorService) { }

  ngOnInit(): void {

  }


}

