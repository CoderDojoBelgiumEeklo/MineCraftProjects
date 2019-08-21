import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {PlayerComponent} from './player.component';

@NgModule({
  declarations: [PlayerComponent],
  entryComponents: [PlayerComponent],
  exports: [PlayerComponent,  CommonModule],
  imports: [CommonModule]
})
export class PlayerModule {

}
