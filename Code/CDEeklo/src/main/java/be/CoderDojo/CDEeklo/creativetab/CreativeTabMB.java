package be.CoderDojo.CDEeklo.creativetab;

import be.CoderDojo.CDEeklo.init.ModItems;
import be.CoderDojo.CDEeklo.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class CreativeTabMB {

    public static  final CreativeTabs MBTab= new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.builder;
        }
    };
}
