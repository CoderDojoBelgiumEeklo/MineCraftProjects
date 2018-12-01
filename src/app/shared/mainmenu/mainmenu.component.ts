import {Component} from '@angular/core';
import {TranslationHelperService} from '../translation/translationhelper.service';

@Component({
  selector: 'pm-mainmenu',
  templateUrl: './mainmenu.component.html'
})
export class MainMenuComponent {

  constructor (public translationHelper: TranslationHelperService) {

  }


  SwitchLang(languageid: number) {
    this.translationHelper.ChangeLanguage(languageid);
    }
  }

