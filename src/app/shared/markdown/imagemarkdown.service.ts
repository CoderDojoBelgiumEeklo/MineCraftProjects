import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ImagemarkdownService {

  getMarkdownExtension () {
    let matches: Array<string> = [];

    return [{type: 'lang', regex: /%istart%([^]+?)%iend%/gi, replace : function(s, match) {
        matches.push(match);
        return '%imageplaceholder' + (matches.length - 1) + '%';
      }}, { type: 'output', filter: function(text) {
        for (let i = 0; i < matches.length; ++i) {
          const pat = '<p>%imageplaceholder' + i + '% *<\/p>';

          const links: string = matches[i];

          const player: string =  '<pm-image [ImageLink]="{url:\'' + links + '\'}"></pm-image>';
          text = text.replace(new RegExp(pat, 'gi'), player);
        }
        // reset array
        matches = [];
        return text;
      }}];
  }


}
