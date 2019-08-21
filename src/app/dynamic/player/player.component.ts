import {Component, Input} from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'pm-player',
  template: '<iframe [src]=\'getVideoUrl()\' frameborder="0" width="700" height="315"  allowfullscreen></iframe>'
})
export class PlayerComponent {

  @Input() VideoLink: string;

  constructor(private sanitizer: DomSanitizer) {

  }

  getVideoUrl()   {
    return this.sanitizer.bypassSecurityTrustResourceUrl(this.VideoLink.replace('watch?v=', 'embed/'));
  }
}
