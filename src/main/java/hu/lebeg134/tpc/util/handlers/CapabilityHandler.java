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
            FoodData Fd = new FoodData();
            //not the best sollution but it works
            boolean addCapability = false;
            switch (Item.getRegistryName().toString())
            {
                case "tfc:food/potato":
                    Fd = Food.POTATO.getData();
                    addCapability = true;
                    break;
                case "harvestcraft:sweetpotatoitem":
                    Fd = TPFood.SWEETPOTATO.getFoodData();
                    addCapability = true;
                    break;
                case "tfc:food/maize":
                    Fd = Food.MAIZE.getData();
                    addCapability = true;
                    break;
                case "tfc:food/maize_grain":
                    Fd = Food.MAIZE_GRAIN.getData();
                    addCapability = true;
                    break;
                case "harvestcraft:turkeyrawitem":
                    Fd = TPFood.TURKEYRAWITEM.getFoodData();
                    addCapability = true;
                    break;
                case "harvestcraft:duckrawitem":
                    Fd = TPFood.DUCKRAWITEM.getFoodData();
                    addCapability = true;
                    break;
                case "minecraft:baked_potato":
                    Fd = TPFood.BAKED_POTATO.getFoodData();
                    addCapability = true;
                    break;
                case "harvestcraft:bakedsweetpotatoitem":
                    Fd = TPFood.BAKEDSWEETPOTATOITEM.getFoodData();
                    addCapability = true;
                    break;
                case "harvestcraft:turkeycookeditem":
                    Fd = TPFood.TURKEYCOOKEDITEM.getFoodData();
                    addCapability = true;
                    break;
                case "harvestcraft:duckcookeditem":
                    Fd = TPFood.DUCKCOOKEDITEM.getFoodData();
                    addCapability = true;
                    break;
            }
            if (addCapability)
                event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(null,Fd,1f,480f));

        }

    }
}
