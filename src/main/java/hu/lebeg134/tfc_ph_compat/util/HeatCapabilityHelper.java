package hu.lebeg134.tfc_ph_compat.util;

import hu.lebeg134.tfc_ph_compat.util.agriculture.TPFood;
import net.dries007.tfc.api.capability.food.FoodData;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public enum HeatCapabilityHelper {
    POTATOITEM("tfc:food/potato", Food.POTATO.getData()),
    SWEETPOTATOITEM("harvestcraft:sweetpotatoitem",TPFood.SWEETPOTATO.getFoodData()),
    MAIZEITEM("tfc:food/maize", Food.MAIZE.getData()),
    MAIZEGRAINITEM("tfc:food/maize_grain", Food.MAIZE_GRAIN.getData()),
    TURKEYRAWITEM("harvestcraft:turkeyrawitem", TPFood.TURKEYRAWITEM.getFoodData()),
    DUCKRAWITEM("harvestcraft:duckrawitem", TPFood.DUCKRAWITEM.getFoodData()),
    BAKEDPOTATOITEM("minecraft:baked_potato", TPFood.BAKED_POTATO.getFoodData()),
    BAKEDSWEETPOTATO("harvestcraft:bakedsweetpotatoitem", TPFood.BAKEDSWEETPOTATOITEM.getFoodData()),
    SESAMESEEDITEM("harvestcraft:sesameseedsitem", TPFood.SESAMESEEDS.getFoodData()),
    WHITEMUSHROOMITEM("harvestcraft:whitemushroomitem", TPFood.WHITEMUSHROOM.getFoodData()),
    TOASTEDSESAMESEEDSITEM("harvestcraft:toastedsesameseedsitem",TPFood.TOASTEDSESAMESEEDSITEM.getFoodData()),
    GRILLEDMUSHROOMITEM("harvestcraft:grilledmushroomitem", TPFood.GRILLEDMUSHROOMITEM.getFoodData()),
    TURKEYCOOKEDITEM("harvestcraft:turkeycookeditem", TPFood.TURKEYCOOKEDITEM.getFoodData()),
    DUCKCOOKEDITEM("harvestcraft:duckcookeditem", TPFood.DUCKCOOKEDITEM.getFoodData());

    private final String name;
    private final FoodData fd;
    private static Map<String, FoodData> dataMap = new HashMap<String, FoodData>();
    static{
        for (HeatCapabilityHelper hch:HeatCapabilityHelper.values()){
            dataMap.put(hch.name, hch.fd);
        }
    }
    HeatCapabilityHelper(String name, FoodData fd){
        this.name = name;
        this.fd = fd;
    }
    public static boolean Contains(String name){
        return dataMap.containsKey(name);
    }
    public static FoodData getFoodData(String name){
        return dataMap.get(name);
    }
}
