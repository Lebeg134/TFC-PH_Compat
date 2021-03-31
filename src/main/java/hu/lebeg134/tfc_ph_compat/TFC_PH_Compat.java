package hu.lebeg134.tfc_ph_compat;

import hu.lebeg134.tfc_ph_compat.compat.CaffeineAddonCompat;
import hu.lebeg134.tfc_ph_compat.compat.FirmaLifeCompat;
import hu.lebeg134.tfc_ph_compat.config.ConfigHandler;
import hu.lebeg134.tfc_ph_compat.proxy.CommonProxy;
import hu.lebeg134.tfc_ph_compat.util.HeatCapabilityHelper;
import hu.lebeg134.tfc_ph_compat.util.agriculture.TPFood;
import hu.lebeg134.tfc_ph_compat.util.agriculture.TPUncooked;
import hu.lebeg134.tfc_ph_compat.util.handlers.OreDictHandler;
import hu.lebeg134.tfc_ph_compat.util.handlers.TPLootTableHandler;
import net.dries007.tfc.api.capability.food.CapabilityFood;
import net.dries007.tfc.api.capability.food.FoodHandler;
import net.dries007.tfc.api.capability.food.FoodHeatHandler;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
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

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:harvestcraft;required-after:tfc;after:ca;after:firmalife")
public class TFC_PH_Compat
{
    @Mod.Instance(value = Reference.MODID)
    public static TFC_PH_Compat instance = new TFC_PH_Compat();

    public static boolean CaffeineAdded = false;
    public static boolean FirmaLifeAdded = false;
    public static boolean PreInitCompleted = false;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static ConfigHandler config;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        HeatCapabilityHelper.LoadData();
        for (TPFood food: TPFood.values())
        {
            CapabilityFood.CUSTOM_FOODS.put(IIngredient.of(food.getItem()),() -> new FoodHandler(null, food.getFoodData()));
        }
        //registering custom handler for Custom uncooked foods
        for (TPUncooked food: TPUncooked.values()){
            CapabilityFood.CUSTOM_FOODS.put(IIngredient.of(food.getItem()),() -> new FoodHeatHandler(null,food.getData(), food.getHeatCapacity(), food.getCookingTemp()));
        }
        if (Loader.isModLoaded("ca"))
            CaffeineAdded = true;
        if (Loader.isModLoaded("firmalife"))
            FirmaLifeAdded = true;

        config = new ConfigHandler(new Configuration(new File(event.getModConfigurationDirectory(), Reference.NAME+".cfg")));
        if ((TFC_PH_Compat.CaffeineAdded && TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualCaffeineCompat)
            MinecraftForge.EVENT_BUS.register(CaffeineAddonCompat.class);
        if ((TFC_PH_Compat.FirmaLifeAdded&& TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualFirmaLifeCompat)
            MinecraftForge.EVENT_BUS.register(FirmaLifeCompat.class);
        PreInitCompleted = true;
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //config overwrite
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
