import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YtplayermarkdownService {



  getMarkdownExtension () {
    let matches: Array<string> = [];

    return [{type: 'lang', regex: /[?][v][[]([^]+?)[\]][v][?]/gi, replace : function(s, match) {
        matches.push(match);
        return '%ytplaceholder' + (matches.length - 1) + '%';
      }}, { type: 'output', filter: function(text) {
        for (let i = 0; i < matches.length; ++i) {
          const pat = '<p>%ytplaceholder' + i + '% *<\/p>';

          const links: string = matches[i];

          const player: string =  '<pm-ytplayer [VideoLink]="{url:\'' + links + '\'}"></pm-ytplayer>';
          text = text.replace(new RegExp(pat, 'gi'), player);
        }
        // reset array
        matches = [];
        return text;
      }}];
  }


}
