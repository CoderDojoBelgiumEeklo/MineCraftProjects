import {ITranslation} from './translation';
import {ISubmenu} from './submenu';


export interface IMenu {
  id: number;
  link: string;
  translation: ITranslation[];
  submenu: IMenu[];
  icon: string;
}
