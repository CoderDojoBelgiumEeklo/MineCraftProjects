import {ITranslation} from './translation';
import {ISubmenu} from './submenu';


export interface IMenu {
  id: number;
  translation: ITranslation[];
  submenu: ISubmenu[];
}
