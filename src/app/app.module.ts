import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import {HttpClientModule} from '@angular/common/http';
import {MenuComponent} from './shared/sidemenu/menu.component';
import {FormsModule} from '@angular/forms';
import {MainMenuComponent} from './shared/mainmenu/mainmenu.component';
import {SubMenuComponent} from './shared/sidemenu/submenu.component';
import {SidebarModule} from 'ng-sidebar';
import {SanitizeHtmlPipe} from './shared/sanitize-html.pipe';
import {OTFModule} from './dynamic/otf.module';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    MainMenuComponent,
    SubMenuComponent,
    SanitizeHtmlPipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    SidebarModule,
    OTFModule
  ],
  bootstrap: [AppComponent],
  exports: [OTFModule]
})
export class AppModule { }
