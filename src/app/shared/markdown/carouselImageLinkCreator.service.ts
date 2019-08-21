import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CarouselImageLinkCreatorService {

 GetImageLinks (imageString: string) {
   let allImageLinks: string = '' ;
   if (imageString)   {
     allImageLinks = '[';
     const links =  imageString.split(',');
     for (let j = 0 ; j < links.length;j++) {
       allImageLinks = allImageLinks + '{url:\'' + links[j] + '\'},';
     }
     allImageLinks = allImageLinks.substr(0, allImageLinks.length - 1);
     allImageLinks = allImageLinks + ']';
   } else {
     allImageLinks = '[]';
   }

   return allImageLinks;
 }
}
