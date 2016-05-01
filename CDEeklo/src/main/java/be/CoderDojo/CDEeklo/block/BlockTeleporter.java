package be.CoderDojo.CDEeklo.block;

import be.CoderDojo.CDEeklo.CDEeklo;
import be.CoderDojo.CDEeklo.block.base.BlockMB;
import be.CoderDojo.CDEeklo.reference.GUIs;
import be.CoderDojo.CDEeklo.reference.Names;
import be.CoderDojo.CDEeklo.tileentity.TileEntityTeleporter;
import be.CoderDojo.CDEeklo.tileentity.base.TileEntityMB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;


/**
 * Created by Obsidean on 03/02/2016.
 */
public class BlockTeleporter extends BlockMB implements ITileEntityProvider {

    public BlockTeleporter(){
        super();
        this.setHardness(0.1f);
        this.setBlockName(Names.Blocks.TELEPORTER);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData) {
        return new TileEntityTeleporter();
    }

    @Override
    public int damageDropped(int metaData) {
        return metaData;
    }

    @Override
    public int getRenderType() {
        return super.getRenderType();
    }

    @Override
    public IIcon getIcon(int par1, int par2) {
        if (ForgeDirection.getOrientation(par1) == ForgeDirection.UP) {
            if (par2 == 0)
                return icons[1];
            else
                return icons[par2];
        }else if(ForgeDirection.getOrientation(par1)==ForgeDirection.DOWN){
            return icons[0];
        } else {
            return icons[2];
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativetab, List list) {
        super.getSubBlocks(item, creativetab, list);
    }

    @Override
    public boolean isOpaqueCube() {
        return super.isOpaqueCube();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz) {
        TileEntity entity = world.getTileEntity(x,y,z);
        if(entity != null){
            if(!world.isRemote && entity instanceof TileEntityTeleporter){
                TileEntityTeleporter cdentity =(TileEntityTeleporter) entity;

                player.openGui(CDEeklo.instance, GUIs.Teleporter.ordinal(),world,x,y,z);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean onBlockEventReceived(World world, int x, int y, int z, int eventId, int eventData) {
        super.onBlockEventReceived(world, x, y, z, eventId, eventData);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity.receiveClientEvent(eventId, eventData);

    }

    @Override
    public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_) {
        return super.onBlockPlaced(p_149660_1_, p_149660_2_, p_149660_3_, p_149660_4_, p_149660_5_, p_149660_6_, p_149660_7_, p_149660_8_, p_149660_9_);
    }

    @Override
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
        super.onBlockPlacedBy(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_, p_149689_6_);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        icons = new IIcon[3];
        icons[0]=iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + 0);
        icons[1]=iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + 1);
        icons[2]=iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + 2);


    }
}
