import {NgModule} from '@angular/core';
import {OTFAComponent} from './otfa.component';
import {CommonModule} from '@angular/common';


@NgModule({
  declarations: [OTFAComponent],
  entryComponents: [OTFAComponent],
  exports: [OTFAComponent,  CommonModule],
  imports: [CommonModule]
})

export class OTFModule {

}
