package hu.lebeg134.tfc_ph_compat;

import hu.lebeg134.tfc_ph_compat.compat.CaffeineAddonCompat;
import hu.lebeg134.tfc_ph_compat.compat.FirmaLifeCompat;
import hu.lebeg134.tfc_ph_compat.config.ConfigHandler;
import hu.lebeg134.tfc_ph_compat.proxy.CommonProxy;
import hu.lebeg134.tfc_ph_compat.util.handlers.OreDictHandler;
import hu.lebeg134.tfc_ph_compat.util.handlers.TPLootTableHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TFC_PH_Compat
{
    @Mod.Instance(value = Reference.MODID)
    public static TFC_PH_Compat instance = new TFC_PH_Compat();

    public static boolean CaffeineAdded = false;
    public static boolean FirmaLifeAdded = false;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static ConfigHandler config;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        for (ModContainer Mod : Loader.instance().getActiveModList() )
        {
            if (Mod.getModId().equals("ca"))
                CaffeineAdded = true;
            if (Mod.getModId().equals("firmalife"))
                FirmaLifeAdded = true;
        }
        config = new ConfigHandler(new Configuration(new File(event.getModConfigurationDirectory(), Reference.NAME+".cfg")));
        if ((TFC_PH_Compat.CaffeineAdded && TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualCaffeineCompat)
            MinecraftForge.EVENT_BUS.register(CaffeineAddonCompat.class);
        if ((TFC_PH_Compat.FirmaLifeAdded&& TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualFirmaLifeCompat)
            MinecraftForge.EVENT_BUS.register(FirmaLifeCompat.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if (config.overwritePHConfig)
            config.overwritePHConfig();
        TPLootTableHandler.Init();
        OreDictHandler.Init();
        if ((TFC_PH_Compat.CaffeineAdded && TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualCaffeineCompat)
            CaffeineAddonCompat.InitCaffeine();
        if ((TFC_PH_Compat.FirmaLifeAdded&& TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualFirmaLifeCompat)
            FirmaLifeCompat.InitFirmaLife();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
