package be.CoderDojo.CDEeklo.init;

import be.CoderDojo.CDEeklo.items.ItemIcon;
import be.CoderDojo.CDEeklo.items.ItemSmallMaze;
import be.CoderDojo.CDEeklo.items.ItemStillASmallMaze;
import be.CoderDojo.CDEeklo.items.ItemVerySmallMaze;
import be.CoderDojo.CDEeklo.items.base.ItemMB;
import be.CoderDojo.CDEeklo.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ModItems {
    public static final ItemMB builder= new ItemIcon();
    public static final ItemMB verySmallMaze= new ItemVerySmallMaze();
    public static final ItemMB stillASmallMaze= new ItemStillASmallMaze();
    public static final ItemMB smallMaze= new ItemSmallMaze();
  //  public static final ItemMB cleanMazes= new ItemCleanMazes();


    public static void init(){

        GameRegistry.registerItem(builder, Names.Items.BUILDERICON);
        GameRegistry.registerItem(verySmallMaze, Names.Items.VERYSMALLMAZE);
        GameRegistry.registerItem(stillASmallMaze, Names.Items.STILLASMALLMAZE);
        GameRegistry.registerItem(smallMaze, Names.Items.SMALLMAZE);
        //GameRegistry.registerItem(cleanMazes, Names.Items.CLEANMAZES);

    }
}
