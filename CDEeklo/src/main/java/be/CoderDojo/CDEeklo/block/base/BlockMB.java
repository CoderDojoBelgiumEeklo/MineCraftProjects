package be.CoderDojo.CDEeklo.block.base;

import be.CoderDojo.CDEeklo.creativetab.CreativeTabMB;
import be.CoderDojo.CDEeklo.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class BlockMB extends Block{
    @SideOnly(Side.CLIENT)
    protected IIcon[] icons;

    protected BlockMB(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    public BlockMB()
    {

        this(Material.rock);
        this.setCreativeTab(CreativeTabMB.MBTab);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() +":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
