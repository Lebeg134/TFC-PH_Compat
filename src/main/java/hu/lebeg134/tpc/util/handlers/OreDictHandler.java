package hu.lebeg134.tpc.util.handlers;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import hu.lebeg134.tpc.util.agriculture.TPCrop;
import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.api.types.Rock;
import net.dries007.tfc.objects.items.ItemSeedsTFC;
import net.dries007.tfc.objects.items.ItemsTFC;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.objects.items.metal.ItemMetalTool;
import net.dries007.tfc.util.agriculture.Crop;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
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

        //tfc seeds
        for (Crop Crop: Crop.values())
        {
            OreDictionary.registerOre("listAllseed", ItemSeedsTFC.get(Crop));
        }
        //tpc seeds
        for (TPCrop Crop: TPCrop.values())
        {
            if (!Crop.name().equals("MUSHROOM"))
                OreDictionary.registerOre("listAllseed", ItemSeedsTFC.get(Crop));
        }



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

        OreDictionary.registerOre("foodCornmeal", new ItemStack(ItemFoodTFC.get(Food.CORNMEAL_FLOUR)));

        OreDictionary.registerOre("foodDough", new ItemStack(ItemFoodTFC.get(Food.CORNMEAL_DOUGH)));

        OreDictionary.registerOre("bread", new ItemStack(ItemFoodTFC.get(Food.CORNBREAD)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemFoodTFC.get(Food.CORNBREAD)));

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

        //OreDictionary.registerOre("foodSalt", new ItemStack(ItemsTFC.SALT));
        //OreDictionary.registerOre("itemSalt", new ItemStack(ItemsTFC.SALT));

        //tfc tools
        OreDictionary.registerOre("toolPot", new ItemStack(ItemsTFC.FIRED_POT));

        OreDictionary.registerOre("toolCuttingboard", new ItemStack(ItemMetalTool.REGISTRY.getObject(new ResourceLocation("tfc:metal/knife/bismuth_bronze"))));



        //removing items from oreDictionary
        //This declutters JEI
        //crops
        removeAll(CropRegistry.getFood(CropRegistry.BLACKBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.BLUEBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.CANDLEBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.RASPBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.STRAWBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.CACTUSFRUIT));
        removeAll(CropRegistry.getFood(CropRegistry.ASPARAGUS));
        removeAll(CropRegistry.getFood(CropRegistry.BARLEY));
        removeAll(CropRegistry.getFood(CropRegistry.OATS));
        removeAll(CropRegistry.getFood(CropRegistry.RYE));
        removeAll(CropRegistry.getFood(CropRegistry.CORN));
        removeAll(CropRegistry.getFood(CropRegistry.BAMBOOSHOOT));
        removeAll(CropRegistry.getFood(CropRegistry.CANTALOUPE));
        removeAll(CropRegistry.getFood(CropRegistry.WINTERSQUASH));
        removeAll(CropRegistry.getFood(CropRegistry.BEET));
        removeAll(CropRegistry.getFood(CropRegistry.ONION));
        removeAll(CropRegistry.getFood(CropRegistry.PARSNIP));
        removeAll(CropRegistry.getFood(CropRegistry.RUTABAGA));
        removeAll(CropRegistry.getFood(CropRegistry.TURNIP));
        removeAll(CropRegistry.getFood(CropRegistry.RHUBARB));
        removeAll(CropRegistry.getFood(CropRegistry.GARLIC));
        removeAll(CropRegistry.getFood(CropRegistry.CAULIFLOWER));
        removeAll(CropRegistry.getFood(CropRegistry.LEEK));
        removeAll(CropRegistry.getFood(CropRegistry.ARTICHOKE));
        removeAll(CropRegistry.getFood(CropRegistry.BRUSSELSPROUT));
        removeAll(CropRegistry.getFood(CropRegistry.CABBAGE));
        removeAll(CropRegistry.getFood(CropRegistry.BEAN));
        removeAll(CropRegistry.getFood(CropRegistry.SOYBEAN));
        removeAll(CropRegistry.getFood(CropRegistry.BELLPEPPER));
        removeAll(CropRegistry.getFood(CropRegistry.OKRA));
        removeAll(CropRegistry.getFood(CropRegistry.TOMATO));
        removeAll(CropRegistry.getFood(CropRegistry.COTTON));
        removeAll(CropRegistry.getFood(CropRegistry.PINEAPPLE));
        removeAll(CropRegistry.getFood(CropRegistry.KIWI));
        removeAll(CropRegistry.getFood(CropRegistry.CRANBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.RICE));
        removeAll(CropRegistry.getFood(CropRegistry.SEAWEED));
        removeAll(CropRegistry.getFood(CropRegistry.CURRYLEAF));
        removeAll(CropRegistry.getFood(CropRegistry.WATERCHESTNUT));
        removeAll(CropRegistry.getFood(CropRegistry.GIGAPICKLE));
        removeAll(CropRegistry.getFood(CropRegistry.KALE));
        removeAll(CropRegistry.getFood(CropRegistry.AGAVE));
        removeAll(CropRegistry.getFood(CropRegistry.AMARANTH));
        removeAll(CropRegistry.getFood(CropRegistry.ARROWROOT));
        removeAll(CropRegistry.getFood(CropRegistry.CASSAVA));
        removeAll(CropRegistry.getFood(CropRegistry.CHICKPEA));
        removeAll(CropRegistry.getFood(CropRegistry.ELDERBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.FLAX));
        removeAll(CropRegistry.getFood(CropRegistry.GREENGRAPE));
        removeAll(CropRegistry.getFood(CropRegistry.HUCKLEBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.JICAMA));
        removeAll(CropRegistry.getFood(CropRegistry.JUTE));
        removeAll(CropRegistry.getFood(CropRegistry.KENAF));
        removeAll(CropRegistry.getFood(CropRegistry.KOHLRABI));
        removeAll(CropRegistry.getFood(CropRegistry.LENTIL));
        removeAll(CropRegistry.getFood(CropRegistry.MILLET));
        removeAll(CropRegistry.getFood(CropRegistry.MULBERRY));
        removeAll(CropRegistry.getFood(CropRegistry.QUINOA));
        removeAll(CropRegistry.getFood(CropRegistry.SISAL));
        removeAll(CropRegistry.getFood(CropRegistry.TARO));
        removeAll(CropRegistry.getFood(CropRegistry.TOMATILLO));
        removeAll(CropRegistry.getFood(CropRegistry.JUNIPERBERRY));
        //seeds
        removeAll(CropRegistry.getSeed(CropRegistry.BLACKBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.BLUEBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.CANDLEBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.RASPBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.STRAWBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.CACTUSFRUIT));
        removeAll(CropRegistry.getSeed(CropRegistry.ASPARAGUS));
        removeAll(CropRegistry.getSeed(CropRegistry.BARLEY));
        removeAll(CropRegistry.getSeed(CropRegistry.OATS));
        removeAll(CropRegistry.getSeed(CropRegistry.RYE));
        removeAll(CropRegistry.getSeed(CropRegistry.CORN));
        removeAll(CropRegistry.getSeed(CropRegistry.BAMBOOSHOOT));
        removeAll(CropRegistry.getSeed(CropRegistry.CANTALOUPE));
        removeAll(CropRegistry.getSeed(CropRegistry.CUCUMBER));
        removeAll(CropRegistry.getSeed(CropRegistry.WINTERSQUASH));
        removeAll(CropRegistry.getSeed(CropRegistry.ZUCCHINI));
        removeAll(CropRegistry.getSeed(CropRegistry.BEET));
        removeAll(CropRegistry.getSeed(CropRegistry.ONION));
        removeAll(CropRegistry.getSeed(CropRegistry.PARSNIP));
        removeAll(CropRegistry.getSeed(CropRegistry.PEANUT));
        removeAll(CropRegistry.getSeed(CropRegistry.RADISH));
        removeAll(CropRegistry.getSeed(CropRegistry.RUTABAGA));
        removeAll(CropRegistry.getSeed(CropRegistry.SWEETPOTATO));
        removeAll(CropRegistry.getSeed(CropRegistry.TURNIP));
        removeAll(CropRegistry.getSeed(CropRegistry.RHUBARB));
        removeAll(CropRegistry.getSeed(CropRegistry.CELERY));
        removeAll(CropRegistry.getSeed(CropRegistry.GARLIC));
        removeAll(CropRegistry.getSeed(CropRegistry.GINGER));
        removeAll(CropRegistry.getSeed(CropRegistry.SPICELEAF));
        removeAll(CropRegistry.getSeed(CropRegistry.TEALEAF));
        removeAll(CropRegistry.getSeed(CropRegistry.COFFEE));
        removeAll(CropRegistry.getSeed(CropRegistry.MUSTARD));
        removeAll(CropRegistry.getSeed(CropRegistry.BROCCOLI));
        removeAll(CropRegistry.getSeed(CropRegistry.CAULIFLOWER));
        removeAll(CropRegistry.getSeed(CropRegistry.LEEK));
        removeAll(CropRegistry.getSeed(CropRegistry.LETTUCE));
        removeAll(CropRegistry.getSeed(CropRegistry.SCALLION));
        removeAll(CropRegistry.getSeed(CropRegistry.ARTICHOKE));
        removeAll(CropRegistry.getSeed(CropRegistry.BRUSSELSPROUT));
        removeAll(CropRegistry.getSeed(CropRegistry.CABBAGE));
        removeAll(CropRegistry.getSeed(CropRegistry.SPINACH));
        removeAll(CropRegistry.getSeed(CropRegistry.WHITEMUSHROOM));
        removeAll(CropRegistry.getSeed(CropRegistry.BEAN));
        removeAll(CropRegistry.getSeed(CropRegistry.SOYBEAN));
        removeAll(CropRegistry.getSeed(CropRegistry.BELLPEPPER));
        removeAll(CropRegistry.getSeed(CropRegistry.CHILIPEPPER));
        removeAll(CropRegistry.getSeed(CropRegistry.EGGPLANT));
        removeAll(CropRegistry.getSeed(CropRegistry.OKRA));
        removeAll(CropRegistry.getSeed(CropRegistry.PEAS));
        removeAll(CropRegistry.getSeed(CropRegistry.TOMATO));
        removeAll(CropRegistry.getSeed(CropRegistry.COTTON));
        removeAll(CropRegistry.getSeed(CropRegistry.PINEAPPLE));
        removeAll(CropRegistry.getSeed(CropRegistry.GRAPE));
        removeAll(CropRegistry.getSeed(CropRegistry.KIWI));
        removeAll(CropRegistry.getSeed(CropRegistry.CRANBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.RICE));
        removeAll(CropRegistry.getSeed(CropRegistry.SEAWEED));
        removeAll(CropRegistry.getSeed(CropRegistry.CURRYLEAF));
        removeAll(CropRegistry.getSeed(CropRegistry.SESAME));
        removeAll(CropRegistry.getSeed(CropRegistry.WATERCHESTNUT));
        removeAll(CropRegistry.getSeed(CropRegistry.GIGAPICKLE));
        removeAll(CropRegistry.getSeed(CropRegistry.KALE));
        removeAll(CropRegistry.getSeed(CropRegistry.AGAVE));
        removeAll(CropRegistry.getSeed(CropRegistry.AMARANTH));
        removeAll(CropRegistry.getSeed(CropRegistry.ARROWROOT));
        removeAll(CropRegistry.getSeed(CropRegistry.CASSAVA));
        removeAll(CropRegistry.getSeed(CropRegistry.CHICKPEA));
        removeAll(CropRegistry.getSeed(CropRegistry.ELDERBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.FLAX));
        removeAll(CropRegistry.getSeed(CropRegistry.GREENGRAPE));
        removeAll(CropRegistry.getSeed(CropRegistry.HUCKLEBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.JICAMA));
        removeAll(CropRegistry.getSeed(CropRegistry.JUTE));
        removeAll(CropRegistry.getSeed(CropRegistry.KENAF));
        removeAll(CropRegistry.getSeed(CropRegistry.KOHLRABI));
        removeAll(CropRegistry.getSeed(CropRegistry.LENTIL));
        removeAll(CropRegistry.getSeed(CropRegistry.MILLET));
        removeAll(CropRegistry.getSeed(CropRegistry.MULBERRY));
        removeAll(CropRegistry.getSeed(CropRegistry.QUINOA));
        removeAll(CropRegistry.getSeed(CropRegistry.SISAL));
        removeAll(CropRegistry.getSeed(CropRegistry.TARO));
        removeAll(CropRegistry.getSeed(CropRegistry.TOMATILLO));
        removeAll(CropRegistry.getSeed(CropRegistry.JUNIPERBERRY));
        //fruits
        removeAll(FruitRegistry.getFood(FruitRegistry.DATE));
        removeAll(FruitRegistry.getFood(FruitRegistry.PAPAYA));
        removeAll(FruitRegistry.getFood(FruitRegistry.CHERRY));
        removeAll(FruitRegistry.getFood(FruitRegistry.FIG));
        removeAll(FruitRegistry.getFood(FruitRegistry.SOURSOP));
        removeAll(FruitRegistry.getFood(FruitRegistry.DRAGONFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.RAMBUTAN));
        removeAll(FruitRegistry.getFood(FruitRegistry.JACKFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.PASSIONFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.APPLE));
        removeAll(FruitRegistry.getFood(FruitRegistry.LEMON));
        removeAll(FruitRegistry.getFood(FruitRegistry.PEAR));
        removeAll(FruitRegistry.getFood(FruitRegistry.OLIVE));
        removeAll(FruitRegistry.getFood(FruitRegistry.SPIDERWEB));
        removeAll(FruitRegistry.getFood(FruitRegistry.GRAPEFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.POMEGRANATE));
        removeAll(FruitRegistry.getFood(FruitRegistry.CASHEW));
        removeAll(FruitRegistry.getFood(FruitRegistry.VANILLABEAN));
        removeAll(FruitRegistry.getFood(FruitRegistry.STARFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.BANANA));
        removeAll(FruitRegistry.getFood(FruitRegistry.PLUM));
        removeAll(FruitRegistry.getFood(FruitRegistry.AVOCADO));
        removeAll(FruitRegistry.getFood(FruitRegistry.PECAN));
        removeAll(FruitRegistry.getFood(FruitRegistry.PISTACHIO));
        removeAll(FruitRegistry.getFood(FruitRegistry.HAZELNUT));
        removeAll(FruitRegistry.getFood(FruitRegistry.LIME));
        removeAll(FruitRegistry.getFood(FruitRegistry.ALMOND));
        removeAll(FruitRegistry.getFood(FruitRegistry.GOOSEBERRY));
        removeAll(FruitRegistry.getFood(FruitRegistry.PEACH));
        removeAll(FruitRegistry.getFood(FruitRegistry.CHESTNUT));
        removeAll(FruitRegistry.getFood(FruitRegistry.PAWPAW));
        removeAll(FruitRegistry.getFood(FruitRegistry.COCONUT));
        removeAll(FruitRegistry.getFood(FruitRegistry.MANGO));
        removeAll(FruitRegistry.getFood(FruitRegistry.APRICOT));
        removeAll(FruitRegistry.getFood(FruitRegistry.ORANGE));
        removeAll(FruitRegistry.getFood(FruitRegistry.WALNUT));
        removeAll(FruitRegistry.getFood(FruitRegistry.LYCHEE));
        removeAll(FruitRegistry.getFood(FruitRegistry.PERSIMMON));
        removeAll(FruitRegistry.getFood(FruitRegistry.GUAVA));
        removeAll(FruitRegistry.getFood(FruitRegistry.BREADFRUIT));
        removeAll(FruitRegistry.getFood(FruitRegistry.NUTMEG));
        removeAll(FruitRegistry.getFood(FruitRegistry.DURIAN));
        removeAll(FruitRegistry.getFood(FruitRegistry.TAMARIND));
        removeAll(FruitRegistry.getFood(FruitRegistry.CINNAMON));
        //Banned PH items
        removeAll(ItemRegistry.saltItem);
        removeAll(ItemRegistry.freshwaterItem);
        removeAll(ItemRegistry.cheeseItem);
        removeAll(ItemRegistry.flourItem);
        removeAll(ItemRegistry.doughItem);
        removeAll(ItemRegistry.friedeggItem);
        removeAll(ItemRegistry.cornmealItem);
        removeAll(ItemRegistry.soymilkItem);
        removeAll(ItemRegistry.firmtofuItem);
        removeAll(ItemRegistry.silkentofuItem);
        removeAll(ItemRegistry.venisonrawItem);
        removeAll(ItemRegistry.venisoncookedItem);
        removeAll(ItemRegistry.groundfishItem);
        removeAll(ItemRegistry.rawtofeakItem);
        removeAll(ItemRegistry.rawtofaconItem);
        removeAll(ItemRegistry.rawtofeegItem);
        removeAll(ItemRegistry.rawtofuttonItem);
        removeAll(ItemRegistry.rawtofickenItem);
        removeAll(ItemRegistry.rawtofabbitItem);
        removeAll(ItemRegistry.rawtofurkeyItem);
        removeAll(ItemRegistry.rawtofenisonItem);
        removeAll(ItemRegistry.rawtofuduckItem);
        removeAll(ItemRegistry.cookedtofeakItem);
        removeAll(ItemRegistry.cookedtofaconItem);
        removeAll(ItemRegistry.cookedtofeegItem);
        removeAll(ItemRegistry.cookedtofuttonItem);
        removeAll(ItemRegistry.cookedtofickenItem);
        removeAll(ItemRegistry.cookedtofabbitItem);
        removeAll(ItemRegistry.cookedtofurkeyItem);
        removeAll(ItemRegistry.cookedtofenisonItem);
        removeAll(ItemRegistry.cookedtofuduckItem);
        //banned vanilla items
        removeAll(Items.APPLE);
        removeAll(Items.WHEAT_SEEDS);
        removeAll(Items.WHEAT);
        removeAll(Items.BREAD);
        removeAll(Items.PORKCHOP);
        removeAll(Items.COOKED_PORKCHOP);
        removeAll(Items.BEEF);
        removeAll(Items.COOKED_BEEF);
        removeAll(Items.CHICKEN);
        removeAll(Items.COOKED_CHICKEN);
        removeAll(Items.CARROT);
        removeAll(Items.POTATO);
        removeAll(Items.RABBIT);
        removeAll(Items.COOKED_RABBIT);
        removeAll(Items.MUTTON);
        removeAll(Items.COOKED_MUTTON);
        removeAll(Items.BEETROOT);
        removeAll(Items.BEETROOT_SEEDS);
        removeAll(Items.CHORUS_FRUIT);
        //unused juices
        removeAll(ItemRegistry.melonjuiceItem);
        removeAll(ItemRegistry.papayajuiceItem);
        removeAll(ItemRegistry.starfruitjuiceItem);
        removeAll(ItemRegistry.limejuiceItem);
        removeAll(ItemRegistry.mangojuiceItem);
        removeAll(ItemRegistry.pomegranatejuiceItem);
        removeAll(ItemRegistry.kiwijuiceItem);
        removeAll(ItemRegistry.cactusfruitjuiceItem);
        removeAll(ItemRegistry.pearjuiceItem);
        removeAll(ItemRegistry.apricotjuiceItem);
        removeAll(ItemRegistry.figjuiceItem);
        removeAll(ItemRegistry.grapefruitjuiceItem);
        removeAll(ItemRegistry.persimmonjuiceItem);
        //unused smoothies
        removeAll(ItemRegistry.melonsmoothieItem);
        removeAll(ItemRegistry.papayasmoothieItem);
        removeAll(ItemRegistry.starfruitsmoothieItem);
        removeAll(ItemRegistry.limesmoothieItem);
        removeAll(ItemRegistry.mangosmoothieItem);
        removeAll(ItemRegistry.pomegranatesmoothieItem);
        removeAll(ItemRegistry.kiwismoothieItem);
        removeAll(ItemRegistry.pearsmoothieItem);
        removeAll(ItemRegistry.apricotsmoothieItem);
        removeAll(ItemRegistry.figsmoothieItem);
        removeAll(ItemRegistry.grapefruitsmoothieItem);
        removeAll(ItemRegistry.persimmonsmoothieItem);
        removeAll(ItemRegistry.coconutsmoothieItem);
        // pot
        removeAll(ItemRegistry.potItem);

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
