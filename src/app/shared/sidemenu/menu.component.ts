import {Component, Input, OnDestroy, OnInit} from '@angular/core';

import {MenuService} from './menu.service';
import {TranslationHelperService} from '../translation/translationhelper.service';
import {IMenu} from './menu';
import {Subscription} from 'rxjs';



@Component({
  selector: 'pm-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./sidebar.css']
})
export class MenuComponent implements OnInit, OnDestroy {


  menu: IMenu[];

  errorMessage: string = '';
  private subscription: Subscription= new Subscription();

  constructor(private menuService: MenuService,
              private translationHelper: TranslationHelperService) {

  }

  ngOnInit(): void {
    this.refreshMenu();
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  refreshMenu() {
    this.subscription.add( this.menuService.getActiveMenuPart().subscribe(
      menu => {
        this.menu = menu;
      },
      error => this.errorMessage = <any>error));
  }

  linkClicked(id: number): void {
    this.menuService.MoveMenu(id);
    this.refreshMenu();
  }

}
