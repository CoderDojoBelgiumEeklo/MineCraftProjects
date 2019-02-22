import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CarouselmarkdownService {

  getMarkdownExtension () {
    let matches: Array<string> = [];

    return [{type: 'lang', regex: /%cstart%([^]+?)%cend%/gi, replace : function(s, match) {
        matches.push(match);
        return '%carouselplaceholder' + (matches.length - 1) + '%';
      }}, { type: 'output', filter: function(text) {
        for (let i = 0; i < matches.length; ++i) {
          const pat = '<p>%carouselplaceholder' + i + '% *<\/p>';

          const links =   matches[i].split(',');
          let imageLink = '';
          imageLink = '[';
          for (let j = 0 ; j < links.length;j++)
          {
            imageLink = imageLink + '{url:\'' + links[j] + '\'},'
          }
          imageLink = imageLink.substr(0, imageLink.length - 1);
          imageLink = imageLink + ']';

          const carousel = '<pm-carousel [ImageLinks] ="' + imageLink + '"></pm-carousel>';

          // text = text.replace(new RegExp(pat, 'gi'), car);
          text = text.replace(new RegExp(pat, 'gi'), carousel);
        }
        // reset array
        matches = [];
        return text;
      }}];
  }
}
