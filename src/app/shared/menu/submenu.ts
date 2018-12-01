import {ITranslation} from './translation';

export interface  ISubmenu {
  id: number;
  link: string;
  translation: ITranslation[];
  submenu: ISubmenu[];
}
