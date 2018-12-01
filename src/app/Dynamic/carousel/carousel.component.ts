import {Component, Input} from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {CarouselItem} from './carouselItem';


@Component({
  selector: 'pm-carousel2',
  templateUrl: './carousel.component.html'
})
export class Carousel2Component {

    @Input() ImageLinks: CarouselItem [];

    constructor(private sanitizer: DomSanitizer) {

    }


   getImg(index: number) {
     return this.sanitizer.bypassSecurityTrustUrl(this.ImageLinks[index].url);
  }


}
