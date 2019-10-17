import { Injectable } from "@angular/core";
import { CarouselImageLinkCreatorService } from "./carouselImageLinkCreator.service";
import { EscapeSanitizerService } from "./escapeSanitizer.service";

@Injectable({
  providedIn: "root"
})
export class LbService {
  getMarkdownExtension(
    cilc: CarouselImageLinkCreatorService,
    esz: EscapeSanitizerService
  ) {
    let matches: Array<any> = [];

    return [
      {
        type: "lang",
        regex: /[?][b][[]([^]+?)[)][b][?]/gim,
        replace: function(s, match) {
          if (match) {
            const t = match.split("](");
            if (t && t[0] && t[1]) {
              matches.push({
                textPart: esz.escapeString(t[0].trim()),
                imagePart: cilc.GetImageLinks(t[1].trim())
              });
            }
            return "%lbplaceholder" + (matches.length - 1) + "%";
          }
        }
      },
      {
        type: "output",
        filter: function(text) {
          for (let i = 0; i < matches.length; ++i) {
            const pat = "<p>%lbplaceholder" + i + "% *</p>";
            const player: string =
              "<pm-layout-bottom [partInfo]=\"{textPart:'" +
              matches[i].textPart +
              "', imagePart:" +
              matches[i].imagePart +
              '}"></pm-layout-bottom>';
            text = text.replace(new RegExp(pat, "gi"), player);
          }
          // reset array
          matches = [];
          return text;
        }
      }
    ];
  }
}
