import {Component} from '@angular/core';

@Component({
  selector: 'pm-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  protected _opened: boolean = true;
  protected _mode: string = 'push';
  protected _position: string = 'left';
}
