package hu.lebeg134.tpc;

import hu.lebeg134.tpc.proxy.CommonProxy;
import hu.lebeg134.tpc.util.handlers.OreDictHandler;
import hu.lebeg134.tpc.util.handlers.TPLootTableHandler;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TFC_PH_compat
{
    @Mod.Instance(value = Reference.MODID)
    public static TFC_PH_compat instance = new TFC_PH_compat();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {


        TPLootTableHandler.Init();
        OreDictHandler.Init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
