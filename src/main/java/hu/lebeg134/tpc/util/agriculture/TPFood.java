package hu.lebeg134.tpc.util.agriculture;


import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import net.dries007.tfc.api.capability.food.FoodData;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

import static net.dries007.tfc.util.agriculture.Food.Category.*;

public enum TPFood {
    TOASTITEM(BREAD, ItemRegistry.toastItem, 4, 2f, 0f, 1.5f, 0f, 0f, 0f, 0f, 1f),
    SPICELEAF(OTHER,"Spiceleaf" , 4, 5f, 1f, 1.5f, 0f, 0f, 0f, 0f, 1f);

    private final Food.Category category;
    private final Item item;
    private final FoodData foodData;

    private final boolean heatable;
    private final float heatCapacity;
    private final float cookingTemp;

    private final String[] oreDictNames;
    TPFood(@Nonnull Food.Category category, String plantName, int hunger, float saturation, float water, float grain, float veg, float fruit, float meat, float dairy, float decayModifier, String... oreNames)
    {
        this(category, CropRegistry.getFood(plantName.toLowerCase()), hunger, saturation, water, grain, veg, fruit, meat, dairy, decayModifier, 0, -1, oreNames);
    }
    TPFood(@Nonnull Food.Category category, Item item, int hunger, float saturation, float water, float grain, float veg, float fruit, float meat, float dairy, float decayModifier, String... oreNames)
    {
        this(category, item, hunger, saturation, water, grain, veg, fruit, meat, dairy, decayModifier, 0, -1, oreNames);
    }
    TPFood(@Nonnull Food.Category category, Item item, int hunger, float saturation, float water, float grain, float veg, float fruit, float meat, float dairy, float decayModifier, float heatCapacity, float cookingTemp, String... oreNames)
    {
        this.category = category;
        this.item = item;
        this.foodData = new FoodData(hunger, water, saturation, grain, fruit, veg, meat, dairy, decayModifier);


        this.heatable = cookingTemp >= 0;
        this.heatCapacity = heatCapacity;
        this.cookingTemp = cookingTemp;

        this.oreDictNames = oreNames == null || oreNames.length == 0 ? null : oreNames;
    }
    public FoodData getFoodData(){ return foodData; }
    public Item getItem(){ return item; }

}
