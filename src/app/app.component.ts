import {Component} from '@angular/core';

@Component({
  selector: 'pm-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  public _opened: boolean = true;
  public _mode: string = 'push';
  public _position: string = 'left';

}

