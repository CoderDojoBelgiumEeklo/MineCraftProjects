import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LlTextManipulationService {

  constructor() {

  }

  TransposeLayoutText(textToTranspose) {
    return this.olineTransformation(textToTranspose);
  }

  olineTransformation(textTorTranspose) {
    const regexp: RegExp  = /~oline ([^]+?) oline~/gmi;
    const execresult = regexp.exec(textTorTranspose);
    return textTorTranspose.replace( regexp, '<div style="text-decoration: overline;">' + execresult[0] + '</div>');

  }

}
