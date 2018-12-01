import {Component, OnInit} from '@angular/core';
import {IMenu} from './menu';
import {MenuService} from './menu.service';
import {TranslationHelperService} from '../translation/translationhelper.service';

@Component({
  selector: 'pm-menu',
  templateUrl: './menu.component.html'
})
export class MenuComponent implements  OnInit {
  menu: IMenu[];
  errorMessage: string = '';

  constructor (private menuService: MenuService, public translationHelper: TranslationHelperService) {

  }

  ngOnInit(): void {
   this.menuService.getMenuStructure().subscribe(
     menu => {
       this.menu = menu;
     },
     error => this.errorMessage = <any> error);
  }

}
