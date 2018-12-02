import {Component, Input} from '@angular/core';
import {ISubmenu} from './submenu';
import {TranslationHelperService} from '../translation/translationhelper.service';
import {PageSelectorService} from '../pageselector.service';

@Component({
  selector: 'pm-submenu',
  template: '' +
    '<ul class="">' +
    ' <li class="">' +
    '  <div *ngIf="submenu.link; else elseBlock">\n' +
    '   <a class="nav-link" (click)="LinkClicked();">{{submenu.translation[translationHelper.currentLanguage.id].Value}}</a>\n' +
    '  </div>\n' +
    '  <ng-template #elseBlock>{{submenu.translation[translationHelper.currentLanguage.id].Value}}</ng-template>\n' +
    '  <div *ngFor="let sm of submenu.submenu">\n' +
    '   <div *ngIf="sm">\n' +
    '     <pm-submenu [submenu]="sm"></pm-submenu>\n' +
    '   </div>\n' +
    '  </div>' +
    ' </li>' +
    '</ul>' +
    ''
})
export  class SubMenuComponent {
 @Input() submenu: ISubmenu;

  constructor (public translationHelper: TranslationHelperService, private pageSelection: PageSelectorService) {

  }

 LinkClicked() {
   this.pageSelection.setActivePage( this.submenu.link);
 }
}
