package hu.lebeg134.tfc_ph_compat.util;

import hu.lebeg134.tfc_ph_compat.util.agriculture.TPFood;
import net.dries007.tfc.api.capability.food.FoodData;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraftforge.fml.common.FMLLog;

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
    DUCKCOOKEDITEM("harvestcraft:duckcookeditem", TPFood.DUCKCOOKEDITEM.getFoodData()),

    RICECROP("tfc:food/rice", Food.RICE.getData()),
    RICEGRAIN("tfc:food/rice_grain", Food.RICE_GRAIN.getData()),

    //Burnable PH foods - some are disabled because food data doesn't exist yet

    //ANCHOVYPEPPERONIPIZZA("harvestcraft:anchovypepperonipizzaitem", TPFood.ANCHOVYPEPPERONIPIZZAITEM.getFoodData()),
    APPLEPIE("harvestcraft:applepieitem", TPFood.APPLEPIEITEM.getFoodData()),
    BBQCHICKENPIZZA("harvestcraft:bbqchickenpizzaitem", TPFood.BBQCHICKENPIZZAITEM.getFoodData()),
    BISCUIT("harvestcraft:biscuititem", TPFood.BISCUITITEM.getFoodData()),
    BLACKBERRYCOBBLER("harvestcraft:blackberrycobbleritem", TPFood.BLACKBERRYCOBBLERITEM.getFoodData()),
    BLUEBERRYMUFFIN("harvestcraft:blueberrymuffinitem", TPFood.BLUEBERRYMUFFINITEM.getFoodData()),
    BLUEBERRYPIE("harvestcraft:blueberrypieitem", TPFood.BLUEBERRYPIEITEM.getFoodData()),
    BRIOCHEBUN("harvestcraft:briochebunitem", TPFood.BRIOCHEBUNITEM.getFoodData()),
    //BUTTERCOOKIE("harvestcraft:buttercookieitem", TPFood.BUTTERCOOKIEITEM.getFoodData()),
    BUTTERTART("harvestcraft:buttertartitem", TPFood.BUTTERTARTITEM.getFoodData()),
    CARAMELCUPCAKE("harvestcraft:caramelcupcakeitem", TPFood.CARAMELCUPCAKEITEM.getFoodData()),
    CARROTCUPCAKE("harvestcraft:carrotcupcakeitem", TPFood.CARROTCUPCAKEITEM.getFoodData()),
    CHAOSCOOKIE("harvestcraft:chaoscookieitem", TPFood.CHAOSCOOKIEITEM.getFoodData()),
    CHERRYPIE("harvestcraft:cherrypieitem", TPFood.CHERRYPIEITEM.getFoodData()),
    CHICKENPOTPIE("harvestcraft:chickenpotpieitem", TPFood.CHICKENPOTPIEITEM.getFoodData()),
    CHILICUPCAKE("harvestcraft:chilicupcakeitem", TPFood.CHILICUPCAKEITEM.getFoodData()),
    CHOCOLATECUPCAKE("harvestcraft:chocolatecupcakeitem", TPFood.CHOCOLATECUPCAKEITEM.getFoodData()),
    CINNAMONBREAD("harvestcraft:cinnamonbreaditem", TPFood.CINNAMONBREADITEM.getFoodData()),
    CINNAMONROLL("harvestcraft:cinnamonrollitem", TPFood.CINNAMONROLLITEM.getFoodData()),
    COFFEECUPCAKE("harvestcraft:coffeecupcakeitem", TPFood.COFFEECUPCAKEITEM.getFoodData()),
    COTTAGEPIE("harvestcraft:cottagepieitem", TPFood.COTTAGEPIEITEM.getFoodData()),
    CRACKER("harvestcraft:crackeritem", TPFood.CRACKERITEM.getFoodData()),
    CRACKERS("harvestcraft:crackersitem", TPFood.CRACKERSITEM.getFoodData()),
    CROISSANT("harvestcraft:croissantitem", TPFood.CROISSANTITEM.getFoodData()),
    DAMPER("harvestcraft:damperitem", TPFood.DAMPERITEM.getFoodData()),
    EGGTART("harvestcraft:eggtartitem", TPFood.EGGTARTITEM.getFoodData()),
    FRUITCRUMBLE("harvestcraft:fruitcrumbleitem", TPFood.FRUITCRUMBLEITEM.getFoodData()),
    GARLICCHICKEN("harvestcraft:garlicchickenitem", TPFood.GARLICCHICKENITEM.getFoodData()),
    GINGERBREAD("harvestcraft:gingerbreaditem", TPFood.GINGERBREADITEM.getFoodData()),
    GINGERSNAPS("harvestcraft:gingersnapsitem", TPFood.GINGERSNAPSITEM.getFoodData()),
    GOOSEBERRYPIE("harvestcraft:gooseberrypieitem", TPFood.GOOSEBERRYPIEITEM.getFoodData()),
    HONEYBUN("harvestcraft:honeybunitem", TPFood.HONEYBUNITEM.getFoodData()),
    HONEYLEMONLAMB("harvestcraft:honeylemonlambitem", TPFood.HONEYLEMONLAMBITEM.getFoodData()),
    HONEYSOYRIBS("harvestcraft:honeysoyribsitem", TPFood.HONEYSOYRIBSITEM.getFoodData()),
    LAMBWITHMINTSAUCE("harvestcraft:lambwithmintsauceitem", TPFood.LAMBWITHMINTSAUCEITEM.getFoodData()),
    LEMONCHICKEN("harvestcraft:lemonchickenitem", TPFood.LEMONCHICKENITEM.getFoodData()),
    LEMONCUPCAKE("harvestcraft:lemoncupcakeitem", TPFood.LEMONCUPCAKEITEM.getFoodData()),
    MEATPIE("harvestcraft:meatpieitem", TPFood.MEATPIEITEM.getFoodData()),
    MINCEPIE("harvestcraft:mincepieitem", TPFood.MINCEPIEITEM.getFoodData()),
    MINTCUPCAKE("harvestcraft:mintcupcakeitem", TPFood.MINTCUPCAKEITEM.getFoodData()),
    //MOCHICAKE("harvestcraft:mochicakeitem", TPFood.MOCHICAKEITEM.getFoodData()),
    ORANGEDUCK("harvestcraft:orangeduckitem", TPFood.ORANGEDUCKITEM.getFoodData()),
    PEACHCOBBLERITEM("harvestcraft:peachcobbleritem", TPFood.PEACHCOBBLERITEM.getFoodData()),
    PEANUTBUTTERCOOKIES("harvestcraft:peanutbuttercookiesitem", TPFood.PEANUTBUTTERCOOKIESITEM.getFoodData()),
    PEANUTBUTTERCUPCAKE("harvestcraft:peanutbuttercupcakeitem", TPFood.PEANUTBUTTERCUPCAKEITEM.getFoodData()),
    //PEKINGDUCK("harvestcraft:pekingduckitem", TPFood.PEKINGDUCKITEM.getFoodData()),
    PIZZA("harvestcraft:pizzaitem", TPFood.PIZZAITEM.getFoodData()),
    PUMPKINBREAD("harvestcraft:pumpkinbreaditem", TPFood.PUMPKINBREADITEM.getFoodData()),
    PUMPKINMUFFIN("harvestcraft:pumpkinmuffinitem", TPFood.PUMPKINMUFFINITEM.getFoodData()),
    PUMPKINOATSCONES("harvestcraft:pumpkinoatsconesitem", TPFood.PUMPKINOATSCONESITEM.getFoodData()),
    PUMPKINPIE("harvestcraft:pumpkinpieitem", TPFood.PUMPKINPIEITEM.getFoodData()),
    RAISINCOOKIESITEM("harvestcraft:raisincookiesitem", TPFood.RAISINCOOKIESITEM.getFoodData()),
    RASPBERRYPIE("harvestcraft:raspberrypieitem", TPFood.RASPBERRYPIEITEM.getFoodData()),
    REDVELVETCUPCAKE("harvestcraft:redvelvetcupcakeitem", TPFood.REDVELVETCUPCAKEITEM.getFoodData()),
    RICECAKE("harvestcraft:ricecakeitem", TPFood.RICECAKEITEM.getFoodData()),
    RIVERMUDCAKE("harvestcraft:rivermudcakeitem", TPFood.RIVERMUDCAKEITEM.getFoodData()),
    ROASTCHICKEN("harvestcraft:roastchickenitem", TPFood.ROASTCHICKENITEM.getFoodData()),
    ROASTPOTATOES("harvestcraft:roastpotatoesitem", TPFood.ROASTPOTATOESITEM.getFoodData()),
    SALISBURYSTEAK("harvestcraft:salisburysteakitem", TPFood.SALISBURYSTEAKITEM.getFoodData()),
    SHEPARDSPIE("harvestcraft:shepardspieitem", TPFood.SHEPARDSPIEITEM.getFoodData()),
    SOFTPRETZEL("harvestcraft:softpretzelitem", TPFood.SOFTPRETZELITEM.getFoodData()),
    SPINACHPIE("harvestcraft:spinachpieitem", TPFood.SPINACHPIEITEM.getFoodData()),
    SPRINKLESCUPCAKE("harvestcraft:sprinklescupcakeitem", TPFood.SPRINKLESCUPCAKEITEM.getFoodData()),
    STRAWBERRYCUPCAKE("harvestcraft:strawberrycupcakeitem", TPFood.STRAWBERRYCUPCAKEITEM.getFoodData()),
    STRAWBERRYPIE("harvestcraft:strawberrypieitem", TPFood.STRAWBERRYPIEITEM.getFoodData()),
    STUFFEDDUCK("harvestcraft:stuffedduckitem", TPFood.STUFFEDDUCKITEM.getFoodData()),
    SUGARCOOKIE("harvestcraft:sugarcookieitem", TPFood.SUGARCOOKIEITEM.getFoodData()),
    //SUNFLOWERWHEATROLLS("harvestcraft:sunflowerwheatrollsitem", TPFood.SUNFLOWERWHEATROLLSITEM.getFoodData()),
    SWEETPOTATOPIE("harvestcraft:sweetpotatopieitem", TPFood.SWEETPOTATOPIEITEM.getFoodData()),
    TIMPANO("harvestcraft:timpanoitem", TPFood.TIMPANOITEM.getFoodData()),
    TIROPITA("harvestcraft:tiropitaitem", TPFood.TIROPITAITEM.getFoodData()),
    TOAST("harvestcraft:toastitem", TPFood.TOASTITEM.getFoodData()),
    TOMATOHERBCHICKEN("harvestcraft:tomatoherbchickenitem", TPFood.TOMATOHERBCHICKENITEM.getFoodData())
    ;
    //VANILLACUPCAKE("harvestcraft:vanillacupcakeitem", TPFood.VANILLACUPCAKEITEM.getFoodData()),


    private static boolean initialized = false;
    private final String name;
    private final FoodData fd;
    private static final Map<String, FoodData> dataMap = new HashMap<>();

    public static void LoadData(){
        for (HeatCapabilityHelper hch:HeatCapabilityHelper.values()){
            dataMap.put(hch.name, hch.fd);
        }
        initialized = true;
    }
    HeatCapabilityHelper(String name, FoodData fd){
        this.name = name;
        this.fd = fd;
    }
    public static boolean Contains(String name){
        if (!initialized){
            FMLLog.bigWarning("Heat Capabilities not yet initialized!");
            return false;
        }
        return dataMap.containsKey(name);
    }
    public static FoodData getFoodData(String name){
        if (!initialized){
            FMLLog.bigWarning("Heat Capabilities not yet initialized!");
            return new FoodData();
        }
        return dataMap.get(name);
    }
}
