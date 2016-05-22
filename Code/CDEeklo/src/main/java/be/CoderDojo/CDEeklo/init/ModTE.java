package be.CoderDojo.CDEeklo.init;

import be.CoderDojo.CDEeklo.reference.Names;
import be.CoderDojo.CDEeklo.reference.Reference;
import be.CoderDojo.CDEeklo.tileentity.TileEntityTeleporter;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class ModTE {

    public static void init(){
        GameRegistry.registerTileEntityWithAlternatives(TileEntityTeleporter.class, Names.Blocks.TELEPORTER, Reference.TE.teTeleporter);
    }

}
