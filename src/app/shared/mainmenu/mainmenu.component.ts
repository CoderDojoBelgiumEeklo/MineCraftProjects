import {Component} from '@angular/core';
import {TranslationHelperService} from '../translation/translationhelper.service';
import {PageSelectorService} from '../pageselector.service';

@Component({
  selector: 'pm-mainmenu',
  templateUrl: './mainmenu.component.html'
})
export class MainMenuComponent {

  constructor (public translationHelper: TranslationHelperService,
               private pageSelection: PageSelectorService) {

  }

  GoHome(){
    this.pageSelection.setActivePage('/welcome');
  }

  SwitchLang(languageid: number) {
    this.translationHelper.ChangeLanguage(languageid);
    }
  }

