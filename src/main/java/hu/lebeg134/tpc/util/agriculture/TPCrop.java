package hu.lebeg134.tpc.util.agriculture;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import net.dries007.tfc.api.types.ICrop;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropDead;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropSimple;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropSpreading;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropTFC;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.util.agriculture.Crop;
import net.dries007.tfc.util.agriculture.Food;
import net.dries007.tfc.util.calendar.CalendarTFC;
import net.dries007.tfc.util.calendar.ICalendar;
import net.dries007.tfc.util.skills.Skill;
import net.dries007.tfc.world.classic.worldgen.WorldGenWildCrops;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public enum TPCrop implements ICrop {
    BROCCOLI(() -> new ItemStack(CropRegistry.getFood(CropRegistry.BROCCOLI)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.6f, CropType.SIMPLE),
    CELERY(() -> new ItemStack(CropRegistry.getFood(CropRegistry.CELERY)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.5f, CropType.SIMPLE),
    CHILI_PEPPER(() -> new ItemStack(CropRegistry.getFood(CropRegistry.CHILIPEPPER)), () -> ItemStack.EMPTY, 5, 10, 40, 45, 50, 70, 400, 450, 6, 0.55f, CropType.PICKABLE),
    COFFEEBEAN(() -> new ItemStack(CropRegistry.getFood(CropRegistry.COFFEE)), () -> ItemStack.EMPTY, 5, 10, 40, 45, 50, 100, 400, 450, 6, 0.5f, CropType.SIMPLE),
    CUCUMBER(() -> new ItemStack(CropRegistry.getFood(CropRegistry.CUCUMBER)), () -> ItemStack.EMPTY, 3, 10, 30, 36, 50, 100, 400, 450, 6, 0.6f, CropType.SIMPLE),
    EGGPLANT(() -> new ItemStack(CropRegistry.getFood(CropRegistry.EGGPLANT)), () -> ItemStack.EMPTY, 5, 14, 33, 37, 45, 90, 390, 440, 6, 0.6f, CropType.SIMPLE),
    GINGER(() -> new ItemStack(CropRegistry.getFood(CropRegistry.GINGER)), () -> ItemStack.EMPTY, -5, 0, 30, 40, 50, 100, 400, 450, 6, 0.5f, CropType.SIMPLE),
    GRAPE(() -> new ItemStack(CropRegistry.getFood(CropRegistry.GRAPE)), () -> ItemStack.EMPTY, 0, 8, 36, 40, 50, 120, 390, 430, 6, 0.5f, CropType.PICKABLE),
    LETTUCE(() -> new ItemStack(CropRegistry.getFood(CropRegistry.LETTUCE)), () -> ItemStack.EMPTY, -10, 0, 27, 33, 50, 60, 280, 300, 6, 0.6f, CropType.SIMPLE),
    MUSHROOM(() -> new ItemStack(CropRegistry.getFood(CropRegistry.WHITEMUSHROOM)), () -> ItemStack.EMPTY, -10, 0, 40, 45, 50, 60, 450, 500, 6, 0.45f, CropType.SIMPLE),
    MUSTARDSEEDS(() -> new ItemStack(CropRegistry.getFood(CropRegistry.MUSTARD)), () -> ItemStack.EMPTY, 5, 10, 35, 40, 50, 100, 400, 450, 6, 0.5f, CropType.SIMPLE),
    PEANUT(() -> new ItemStack(CropRegistry.getFood(CropRegistry.PEANUT)), () -> ItemStack.EMPTY, 0, 4, 30, 35, 50, 100, 390, 440, 6, 0.55f, CropType.SIMPLE),
    PEAS(() -> new ItemStack(CropRegistry.getFood(CropRegistry.PEAS)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.5f, CropType.PICKABLE),
    PEPPERCORN(() -> new ItemStack(FruitRegistry.getFood(FruitRegistry.PEPPERCORN)), () -> ItemStack.EMPTY, 5, 10, 40, 45, 50, 100, 400, 450, 6, 0.5f, CropType.PICKABLE),
    RADISH(() -> new ItemStack(CropRegistry.getFood(CropRegistry.RADISH)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.6f, CropType.SIMPLE),
    SCALLION(() -> new ItemStack(CropRegistry.getFood(CropRegistry.SCALLION)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.5f, CropType.SIMPLE),
    SESAMESEEDS(() -> new ItemStack(CropRegistry.getFood(CropRegistry.SESAME)), () -> ItemStack.EMPTY, 2, 9, 35, 41, 70, 150, 410, 450, 6, 0.5f, CropType.SIMPLE),
    SPICELEAF(() -> new ItemStack(CropRegistry.getFood(CropRegistry.SPICELEAF)), () -> ItemStack.EMPTY, -5, 0, 30, 40, 50, 100, 400, 450, 6, 0.5f, CropType.SIMPLE),
    SPINACH(() -> new ItemStack(CropRegistry.getFood(CropRegistry.SPINACH)), () -> ItemStack.EMPTY, -10, 0, 27, 33, 50, 60, 280, 300, 6, 0.6f, CropType.SIMPLE),
    SWEETPOTATO(() -> new ItemStack(CropRegistry.getFood(CropRegistry.SWEETPOTATO)), () -> ItemStack.EMPTY, 0, 4, 30, 35, 50, 100, 390, 440, 6, 0.55f, CropType.SIMPLE),
    TEALEAF(() -> new ItemStack(CropRegistry.getFood(CropRegistry.TEALEAF)), () -> ItemStack.EMPTY, -5, 0, 30, 40, 50, 100, 400, 450, 6, 0.6f, CropType.SIMPLE),
    ZUCCHINI(() -> new ItemStack(CropRegistry.getFood(CropRegistry.ZUCCHINI)), () -> ItemStack.EMPTY, 3, 10, 30, 36, 50, 100, 400, 450, 6, 0.6f, CropType.SIMPLE);




    //CODE from TFC
    static
    {
        for (ICrop crop : values())
        {
            WorldGenWildCrops.register(crop);
        }
    }

    /**
     * the count to add to the amount of food dropped when applying the skill bonus
     *
     * @param skill  agriculture skill of the harvester
     * @param random random instance to use, generally Block.RANDOM
     * @return amount to add to item stack count
     */
    public static int getSkillFoodBonus(Skill skill, Random random)
    {
        return Crop.getSkillFoodBonus(skill, random);
    }

    /**
     * the count to add to the amount of seeds dropped when applying the skill bonus
     *
     * @param skill  agriculture skill of the harvester
     * @param random random instance to use, generally Block.RANDOM
     * @return amount to add to item stack count
     */
    public static int getSkillSeedBonus(Skill skill, Random random)
    {
        return Crop.getSkillSeedBonus(skill, random);
    }

    // how this crop generates food items
    private final Supplier<ItemStack> foodDrop;
    private final Supplier<ItemStack> foodDropEarly;
    // temperature compatibility range
    private final float tempMinAlive, tempMinGrow, tempMaxGrow, tempMaxAlive;
    // rainfall compatibility range
    private final float rainMinAlive, rainMinGrow, rainMaxGrow, rainMaxAlive;
    // growth
    private final int growthStages; // the number of blockstates the crop has for growing, ignoring wild state
    private final float growthTime; // Time is measured in % of months, scales with calendar month length
    // which crop block behavior implementation is used
    private final TPCrop.CropType type;

    TPCrop(Food foodDrop, float tempMinAlive, float tempMinGrow, float tempMaxGrow, float tempMaxAlive, float rainMinAlive, float rainMinGrow, float rainMaxGrow, float rainMaxAlive, int growthStages, float growthTime, TPCrop.CropType type)
    {
        this(() -> new ItemStack(ItemFoodTFC.get(foodDrop)), () -> ItemStack.EMPTY, tempMinAlive, tempMinGrow, tempMaxGrow, tempMaxAlive, rainMinAlive, rainMinGrow, rainMaxGrow, rainMaxAlive, growthStages, growthTime, type);
    }

    TPCrop(Supplier<ItemStack> foodDrop, Supplier<ItemStack> foodDropEarly, float tempMinAlive, float tempMinGrow, float tempMaxGrow, float tempMaxAlive, float rainMinAlive, float rainMinGrow, float rainMaxGrow, float rainMaxAlive, int growthStages, float growthTime, TPCrop.CropType type)
    {
        this.foodDrop = foodDrop;
        this.foodDropEarly = foodDropEarly;

        this.tempMinAlive = tempMinAlive;
        this.tempMinGrow = tempMinGrow;
        this.tempMaxGrow = tempMaxGrow;
        this.tempMaxAlive = tempMaxAlive;

        this.rainMinAlive = rainMinAlive;
        this.rainMinGrow = rainMinGrow;
        this.rainMaxGrow = rainMaxGrow;
        this.rainMaxAlive = rainMaxAlive;

        this.growthStages = growthStages;
        this.growthTime = growthTime; // This is measured in % of months

        this.type = type;
    }

    @Override
    public long getGrowthTicks()
    {
        return (long) (growthTime * CalendarTFC.CALENDAR_TIME.getDaysInMonth() * ICalendar.TICKS_IN_DAY);
    }

    @Override
    public int getMaxStage()
    {
        return growthStages - 1;
    }

    @Override
    public boolean isValidConditions(float temperature, float rainfall)
    {
        return tempMinAlive < temperature && temperature < tempMaxAlive && rainMinAlive < rainfall && rainfall < rainMaxAlive;
    }

    @Override
    public boolean isValidForGrowth(float temperature, float rainfall)
    {
        return tempMinGrow < temperature && temperature < tempMaxGrow && rainMinGrow < rainfall && rainfall < rainMaxGrow;
    }

    @Nonnull
    @Override
    public ItemStack getFoodDrop(int currentStage)
    {
        if (currentStage == getMaxStage())
        {
            return foodDrop.get();
        }
        else if (currentStage == getMaxStage() - 1)
        {
            return foodDropEarly.get();
        }
        return ItemStack.EMPTY;
    }

    public BlockCropTFC createGrowingBlock()
    {
        if (type == CropType.SIMPLE || type == CropType.PICKABLE)
        {
            return BlockCropSimple.create(this, type == CropType.PICKABLE);
        }
        else if (type == CropType.SPREADING)
        {
            return BlockCropSpreading.create(this);
        }
        throw new IllegalStateException("Invalid growthstage property " + growthStages + " for crop");
    }

    public BlockCropDead createDeadBlock()
    {
        return new BlockCropDead(this);
    }

    @SideOnly(Side.CLIENT)
    public void addInfo(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if (GuiScreen.isShiftKeyDown())
        {
            tooltip.add(TextFormatting.GRAY + I18n.format("tfc.tooltip.climate_info"));
            tooltip.add(TextFormatting.BLUE + I18n.format("tfc.tooltip.climate_info_rainfall", (int) rainMinGrow, (int) rainMaxGrow));
            tooltip.add(TextFormatting.GOLD + I18n.format("tfc.tooltip.climate_info_temperature", String.format("%.1f", tempMinGrow), String.format("%.1f", tempMaxGrow)));
        }
        else
        {
            tooltip.add(TextFormatting.GRAY + I18n.format("tfc.tooltip.hold_shift_for_climate_info"));
        }
    }

    enum CropType
    {
        SIMPLE, PICKABLE, SPREADING
    }

}
