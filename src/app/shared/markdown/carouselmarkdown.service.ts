import {Injectable} from '@angular/core';
import {CarouselImageLinkCreatorService} from './carouselImageLinkCreator.service';

@Injectable({
  providedIn: 'root'
})
export class CarouselmarkdownService {

  getMarkdownExtension (cilc: CarouselImageLinkCreatorService) {
    let matches: Array<string> = [];

    return [{type: 'lang', regex: /[?][c][\(]([^]+?)[\)][c][?]/gmi, replace : function(s, match) {
        matches.push(cilc.GetImageLinks(match));
        return '%carouselplaceholder' + (matches.length - 1) + '%';
      }}, { type: 'output', filter: function(text) {
        for (let i = 0; i < matches.length; ++i) {
          const pat = '<p>%carouselplaceholder' + i + '% *<\/p>';

          const carousel = '<pm-carousel [ImageLinks] ="' + matches[i] + '"></pm-carousel>';

          // text = text.replace(new RegExp(pat, 'gi'), car);
          text = text.replace(new RegExp(pat, 'gi'), carousel);
        }
        // reset array
        matches = [];
        return text;
      }}];
  }
}
