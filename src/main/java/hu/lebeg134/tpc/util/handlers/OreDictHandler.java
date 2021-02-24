package hu.lebeg134.tpc.util.handlers;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
    public static void Init(){
        // PH plants
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("spiceleaf"));
        OreDictionary.registerOre("categoryOther", FruitRegistry.getFood("peppercorn"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("peppercorn"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("mustardseeds"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("sweetpotato"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("lettuce"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("cucumber"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("whitemushroom"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("chilipepper"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("peas"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("broccoli"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("ginger"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("spinach"));
        OreDictionary.registerOre("categoryGrain", CropRegistry.getFood("sesameseeds"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("coffeebean"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("radish"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("zucchini"));
        OreDictionary.registerOre("categoryFruit", CropRegistry.getFood("grape"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("eggplant"));
        OreDictionary.registerOre("categoryOther", CropRegistry.getFood("tealeaf"));
        OreDictionary.registerOre("categoryGrain", CropRegistry.getFood("peanut"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("celery"));
        OreDictionary.registerOre("categoryVegetable", CropRegistry.getFood("scallion"));

        //harvestcraft meats
        OreDictionary.registerOre("categoryMeat", ItemRegistry.turkeyrawItem);
        OreDictionary.registerOre("categoryCookedMeat", ItemRegistry.turkeycookedItem);
        OreDictionary.registerOre("categoryMeat", ItemRegistry.duckrawItem);
        OreDictionary.registerOre("categoryCookedMeat", ItemRegistry.duckcookedItem);

        //tfc food items
        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.BANANA)));
        OreDictionary.registerOre("cropBanana", new ItemStack(ItemFoodTFC.get(Food.BANANA)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.BLACKBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.BLACKBERRY)));
        OreDictionary.registerOre("cropBlackberry", new ItemStack(ItemFoodTFC.get(Food.BLACKBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.BLUEBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.BLUEBERRY)));
        OreDictionary.registerOre("cropBlueberry", new ItemStack(ItemFoodTFC.get(Food.BLUEBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.BUNCH_BERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.BUNCH_BERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.CHERRY)));
        OreDictionary.registerOre("cropCherry", new ItemStack(ItemFoodTFC.get(Food.CHERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.CLOUD_BERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.CLOUD_BERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.CRANBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.CRANBERRY)));
        OreDictionary.registerOre("cropCranberry", new ItemStack(ItemFoodTFC.get(Food.CRANBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.ELDERBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.ELDERBERRY)));
        OreDictionary.registerOre("cropElderberry", new ItemStack(ItemFoodTFC.get(Food.ELDERBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.GOOSEBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.GOOSEBERRY)));
        OreDictionary.registerOre("cropGooseberry", new ItemStack(ItemFoodTFC.get(Food.GOOSEBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.GREEN_APPLE)));
        OreDictionary.registerOre("cropApple", new ItemStack(ItemFoodTFC.get(Food.GREEN_APPLE)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.LEMON)));
        OreDictionary.registerOre("listAllcitrus", new ItemStack(ItemFoodTFC.get(Food.LEMON)));
        OreDictionary.registerOre("cropLemon", new ItemStack(ItemFoodTFC.get(Food.LEMON)));

        OreDictionary.registerOre("cropOlive", new ItemStack(ItemFoodTFC.get(Food.OLIVE)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.ORANGE)));
        OreDictionary.registerOre("listAllcitrus", new ItemStack(ItemFoodTFC.get(Food.ORANGE)));
        OreDictionary.registerOre("cropOrange", new ItemStack(ItemFoodTFC.get(Food.ORANGE)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.PEACH)));
        OreDictionary.registerOre("cropPeach", new ItemStack(ItemFoodTFC.get(Food.PEACH)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.PLUM)));
        OreDictionary.registerOre("cropPlum", new ItemStack(ItemFoodTFC.get(Food.PLUM)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.RASPBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.RASPBERRY)));
        OreDictionary.registerOre("cropRaspberry", new ItemStack(ItemFoodTFC.get(Food.RASPBERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.RED_APPLE)));
        OreDictionary.registerOre("cropApple", new ItemStack(ItemFoodTFC.get(Food.RED_APPLE)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.SNOW_BERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.SNOW_BERRY)));

        OreDictionary.registerOre("listAllfruit", new ItemStack(ItemFoodTFC.get(Food.STRAWBERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.STRAWBERRY)));
        OreDictionary.registerOre("cropStrawberry", new ItemStack(ItemFoodTFC.get(Food.STRAWBERRY)));

        OreDictionary.registerOre("listAllfruit" , new ItemStack(ItemFoodTFC.get(Food.WINTERGREEN_BERRY)));
        OreDictionary.registerOre("listAllberry", new ItemStack(ItemFoodTFC.get(Food.WINTERGREEN_BERRY)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.BARLEY)));
        OreDictionary.registerOre("cropBarley", new ItemStack(ItemFoodTFC.get(Food.BARLEY)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.BARLEY_GRAIN)));
        OreDictionary.registerOre("cropBarley", new ItemStack(ItemFoodTFC.get(Food.BARLEY_GRAIN)));

        OreDictionary.registerOre("foodFlour", new ItemStack(ItemFoodTFC.get(Food.BARLEY_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.BARLEY_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.BARLEY_BREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.BARLEY_BREAD)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.MAIZE)));
        OreDictionary.registerOre("cropCorn", new ItemStack(ItemFoodTFC.get(Food.MAIZE)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.MAIZE_GRAIN)));
        OreDictionary.registerOre("cropCorn", new ItemStack(ItemFoodTFC.get(Food.MAIZE_GRAIN)));

        OreDictionary.registerOre("foodCornmeal", new ItemStack(ItemFoodTFC.get(Food.CORNBREAD)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.CORNMEAL_FLOUR)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.CORNMEAL_DOUGH)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.CORNMEAL_DOUGH)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.OAT)));
        OreDictionary.registerOre("cropOats", new ItemStack(ItemFoodTFC.get(Food.OAT)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.OAT_GRAIN)));
        OreDictionary.registerOre("cropOats", new ItemStack(ItemFoodTFC.get(Food.OAT_GRAIN)));

        OreDictionary.registerOre("foodFlour", new ItemStack(ItemFoodTFC.get(Food.OAT_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.OAT_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.OAT_BREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.OAT_BREAD)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.RICE)));
        OreDictionary.registerOre("cropRice", new ItemStack(ItemFoodTFC.get(Food.RICE)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.RICE_GRAIN)));
        OreDictionary.registerOre("cropRice", new ItemStack(ItemFoodTFC.get(Food.RICE_GRAIN)));

        OreDictionary.registerOre("foodFlour", new ItemStack(ItemFoodTFC.get(Food.RICE_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.RICE_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.RICE_BREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.RICE_BREAD)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.RYE)));
        OreDictionary.registerOre("cropRye", new ItemStack(ItemFoodTFC.get(Food.RYE)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.RYE_GRAIN)));
        OreDictionary.registerOre("cropRye", new ItemStack(ItemFoodTFC.get(Food.RYE_GRAIN)));

        OreDictionary.registerOre("foodFlour", new ItemStack(ItemFoodTFC.get(Food.RYE_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.RYE_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.RYE_BREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.RYE_BREAD)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.WHEAT)));
        OreDictionary.registerOre("cropWheat", new ItemStack(ItemFoodTFC.get(Food.WHEAT)));

        OreDictionary.registerOre("listAllgrain", new ItemStack(ItemFoodTFC.get(Food.WHEAT_GRAIN)));
        OreDictionary.registerOre("cropWheat", new ItemStack(ItemFoodTFC.get(Food.WHEAT_GRAIN)));

        OreDictionary.registerOre("foodFlour", new ItemStack(ItemFoodTFC.get(Food.WHEAT_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.WHEAT_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.WHEAT_BREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.WHEAT_BREAD)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.BEET)));
        OreDictionary.registerOre("cropBeet", new ItemStack(ItemFoodTFC.get(Food.BEET)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.CABBAGE)));
        OreDictionary.registerOre("listAllgreenveggie", new ItemStack(ItemFoodTFC.get(Food.CABBAGE)));
        OreDictionary.registerOre("cropCabbage", new ItemStack(ItemFoodTFC.get(Food.CABBAGE)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.CARROT)));
        OreDictionary.registerOre("cropCarrot", new ItemStack(ItemFoodTFC.get(Food.CARROT)));

        OreDictionary.registerOre("listAllherb", new ItemStack(ItemFoodTFC.get(Food.GARLIC)));
        OreDictionary.registerOre("cropGarlic", new ItemStack(ItemFoodTFC.get(Food.GARLIC)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.GREEN_BEAN)));
        OreDictionary.registerOre("cropBean", new ItemStack(ItemFoodTFC.get(Food.GREEN_BEAN)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.GREEN_BELL_PEPPER)));
        OreDictionary.registerOre("listAllpepper", new ItemStack(ItemFoodTFC.get(Food.GREEN_BELL_PEPPER)));
        OreDictionary.registerOre("cropBellpepper", new ItemStack(ItemFoodTFC.get(Food.GREEN_BELL_PEPPER)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.ONION)));
        OreDictionary.registerOre("cropOnion", new ItemStack(ItemFoodTFC.get(Food.ONION)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.POTATO)));
        OreDictionary.registerOre("cropPotato", new ItemStack(ItemFoodTFC.get(Food.POTATO)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.RED_BELL_PEPPER)));
        OreDictionary.registerOre("listAllpepper", new ItemStack(ItemFoodTFC.get(Food.RED_BELL_PEPPER)));
        OreDictionary.registerOre("cropBellpepper", new ItemStack(ItemFoodTFC.get(Food.RED_BELL_PEPPER)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.SEAWEED)));
        OreDictionary.registerOre("listAllgreenveggie", new ItemStack(ItemFoodTFC.get(Food.SEAWEED)));
        OreDictionary.registerOre("cropSeaweed", new ItemStack(ItemFoodTFC.get(Food.SEAWEED)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.SOYBEAN)));
        OreDictionary.registerOre("cropSoybean", new ItemStack(ItemFoodTFC.get(Food.SOYBEAN)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.SQUASH)));
        OreDictionary.registerOre("cropWintersquash", new ItemStack(ItemFoodTFC.get(Food.SQUASH)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.TOMATO)));
        OreDictionary.registerOre("cropTomato", new ItemStack(ItemFoodTFC.get(Food.TOMATO)));

        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemFoodTFC.get(Food.YELLOW_BELL_PEPPER)));
        OreDictionary.registerOre("listAllpepper", new ItemStack(ItemFoodTFC.get(Food.YELLOW_BELL_PEPPER)));
        OreDictionary.registerOre("cropBellpepper", new ItemStack(ItemFoodTFC.get(Food.YELLOW_BELL_PEPPER)));

        OreDictionary.registerOre("foodCheese", new ItemStack(ItemFoodTFC.get(Food.CHEESE)));

        OreDictionary.registerOre("foodFriedegg", new ItemStack(ItemFoodTFC.get(Food.COOKED_EGG)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.BEEF)));
        OreDictionary.registerOre("listAllbeefraw", new ItemStack(ItemFoodTFC.get(Food.BEEF)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_BEEF)));
        OreDictionary.registerOre("listAllbeefcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_BEEF)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.PORK)));
        OreDictionary.registerOre("listAllporkraw", new ItemStack(ItemFoodTFC.get(Food.PORK)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_PORK)));
        OreDictionary.registerOre("listAllporkcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_PORK)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.CHICKEN)));
        OreDictionary.registerOre("listAllchickenraw", new ItemStack(ItemFoodTFC.get(Food.CHICKEN)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_CHICKEN)));
        OreDictionary.registerOre("listAllchickencooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_CHICKEN)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.MUTTON)));
        OreDictionary.registerOre("listAllmuttonraw", new ItemStack(ItemFoodTFC.get(Food.MUTTON)));
        OreDictionary.registerOre("foodMuttonraw", new ItemStack(ItemFoodTFC.get(Food.MUTTON)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_MUTTON)));
        OreDictionary.registerOre("listAllmuttoncooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_MUTTON)));
        OreDictionary.registerOre("foodMuttoncooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_MUTTON)));

        OreDictionary.registerOre("listAllfishraw", new ItemStack(ItemFoodTFC.get(Food.FISH)));
        OreDictionary.registerOre("listAllfishfresh", new ItemStack(ItemFoodTFC.get(Food.FISH)));
        OreDictionary.registerOre("salmonRaw" , new ItemStack(ItemFoodTFC.get(Food.FISH)));

        OreDictionary.registerOre("listAllfishcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_FISH)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.BEAR)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_BEAR)));

        OreDictionary.registerOre("listAllfishraw", new ItemStack(ItemFoodTFC.get(Food.CALAMARI)));
        OreDictionary.registerOre("listAllfishfresh", new ItemStack(ItemFoodTFC.get(Food.CALAMARI)));
        OreDictionary.registerOre("foodCalamariraw" , new ItemStack(ItemFoodTFC.get(Food.CALAMARI)));

        OreDictionary.registerOre("listAllfishcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_CALAMARI)));
        OreDictionary.registerOre("foodCalamaricooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_CALAMARI)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.HORSE_MEAT)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_HORSE_MEAT)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.PHEASANT)));
        OreDictionary.registerOre("listAllchickenraw", new ItemStack(ItemFoodTFC.get(Food.PHEASANT)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_PHEASANT)));
        OreDictionary.registerOre("listAllchickencooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_PHEASANT)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.VENISON)));
        OreDictionary.registerOre("listAllvenisonraw", new ItemStack(ItemFoodTFC.get(Food.VENISON)));
        OreDictionary.registerOre("foodVenisonraw", new ItemStack(ItemFoodTFC.get(Food.VENISON)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_VENISON)));
        OreDictionary.registerOre("listAllvenisoncooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_VENISON)));
        OreDictionary.registerOre("foodVenisoncooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_VENISON)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.WOLF)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_WOLF)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.RABBIT)));
        OreDictionary.registerOre("listAllrabbitraw", new ItemStack(ItemFoodTFC.get(Food.RABBIT)));
        OreDictionary.registerOre("foodRabbitraw", new ItemStack(ItemFoodTFC.get(Food.RABBIT)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_RABBIT)));
        OreDictionary.registerOre("listAllrabbitcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_RABBIT)));
        OreDictionary.registerOre("foodRabbitcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_RABBIT)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.MONGOOSE)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_MONGOOSE)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.GRAN_FELINE)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_GRAN_FELINE)));

        OreDictionary.registerOre("listAllmeatraw", new ItemStack(ItemFoodTFC.get(Food.CAMELIDAE)));

        OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFoodTFC.get(Food.COOKED_CAMELIDAE)));

        //removing items from oreDictionary
        //This declutters JEI
        removeAll(FruitRegistry.getFood(FruitRegistry.BANANA));
    }
    public static void remove(String name, Item Item)
    {
        OreDictionary.getOres(name, false).removeIf(e -> e.getItem().equals(Item));

        //OreDictionary.getOres(name, false).remove(new ItemStack(Item));


    }
    public static void removeAll(Item Item){
        for (int ID: OreDictionary.getOreIDs(new ItemStack(Item)))
        {
            remove(OreDictionary.getOreName(ID) , Item);
        }
    }
}
