package be.CoderDojo.CDEeklo.items;

import be.CoderDojo.CDEeklo.items.base.ItemMB;
import be.CoderDojo.CDEeklo.reference.Names;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ItemIcon extends ItemMB{


    public ItemIcon(){

        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.BUILDERICON);
    }
}
