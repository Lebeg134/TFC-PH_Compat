package hu.lebeg134.tfc_ph_compat.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends hu.lebeg134.tfc_ph_compat.proxy.CommonProxy
{
    @Override
    public void registerModel(Item item, int metadata)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
