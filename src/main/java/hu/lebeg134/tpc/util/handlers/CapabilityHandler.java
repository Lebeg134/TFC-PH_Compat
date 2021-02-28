package hu.lebeg134.tpc.util.handlers;

import hu.lebeg134.tpc.util.agriculture.TPFood;
import net.dries007.tfc.api.capability.food.FoodData;
import net.dries007.tfc.api.capability.food.FoodHeatHandler;
import net.dries007.tfc.api.capability.heat.CapabilityItemHeat;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CapabilityHandler {
    @SubscribeEvent
    public static void attachItemCapabilities(AttachCapabilitiesEvent<ItemStack> event)
    {
        Item Item = event.getObject().getItem();
        if (Item.getRegistryName() != null)
        {
            FoodData Fd;
            //not the best sollution but it works
            switch (Item.getRegistryName().toString())
            {
                case "tfc:food/potato":
                    Fd = Food.POTATO.getData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:sweetpotatoitem":
                    Fd = TPFood.SWEETPOTATO.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "tfc:food/maize":
                    Fd = Food.MAIZE.getData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "tfc:food/maize_grain":
                    Fd = Food.MAIZE_GRAIN.getData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:turkeyrawitem":
                    Fd = TPFood.TURKEYRAWITEM.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:duckrawitem":
                    Fd = TPFood.DUCKRAWITEM.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "minecraft:baked_potato":
                    Fd = TPFood.BAKED_POTATO.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:bakedsweetpotatoitem":
                    Fd = TPFood.BAKEDSWEETPOTATOITEM.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:turkeycookeditem":
                    Fd = TPFood.TURKEYCOOKEDITEM.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
                case "harvestcraft:duckcookeditem":
                    Fd = TPFood.DUCKCOOKEDITEM.getFoodData();
                    event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));
                    break;
            }

        }

    }
}
