import {Injectable, SecurityContext} from '@angular/core';
import {CarouselImageLinkCreatorService} from './carouselImageLinkCreator.service';
import {EscapeSanitizerService} from './escapeSanitizer.service';


@Injectable({
  providedIn: 'root'
})
export class LrService {

  getMarkdownExtension(cilc: CarouselImageLinkCreatorService,
                       esz: EscapeSanitizerService
                       ) {
    let matches: Array<any> = [];

    return [{
      type: 'lang', regex: /[?][r][[]([^]+?)[)]/gmi, replace: function (s, match) {
        if (match) {
          const t = match.split('](');
          if (t && t[0] && t[1]) {
            matches.push({textPart: esz.escapeString( t[0].trim()), imagePart:  cilc.GetImageLinks(t[1].trim())});
          }

          return '%lrplaceholder' + (matches.length - 1) + '%';
        }
      }
    }, {
      type: 'output', filter: function (text) {
        for (let i = 0; i < matches.length; ++i) {
          const pat = '<p>%lrplaceholder' + i + '% *<\/p>';

          const player: string = '<pm-layout-right [partInfo]="{textPart:\'' + matches[i].textPart + '\', imagePart:' + matches[i].imagePart + '}"></pm-layout-right>';
          text = text.replace(new RegExp(pat, 'gi'), player);
        }
        // reset array
        matches = [];
        return text;
      }
    }];
  }
}
