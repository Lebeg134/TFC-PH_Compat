package hu.lebeg134.tpc.util.handlers;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDIctHandler {
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


    }
}
