package hu.lebeg134.tfc_ph_compat.util.agriculture;

import com.pam.harvestcraft.item.items.ItemPamFood;
import net.dries007.tfc.api.capability.food.FoodData;
import net.dries007.tfc.util.agriculture.Food;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static net.dries007.tfc.util.agriculture.Food.Category.*;

public enum TPUncooked {
    UNCOOKEDANCHOVYPEPPERONIPIZZAITEM(GRAIN, 4,3.5f,0f,0.5f,1.25f,0f,1.75f,1.5f,3.5f,1f,480),
    UNCOOKEDAPPLEPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.5f,0f,0f,2.68f,1f,480),
    UNCOOKEDBBQCHICKENPIZZAITEM(GRAIN, 4,3f,0f,0.5f,1.25f,0f,1.25f,1.5f,3.5f,1f,480),
    UNCOOKEDBISCUITITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0f,4.42f,1f,480),
    UNCOOKEDBLACKBERRYCOBBLERITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0.5f,0f,0f,3.82f,1f,480),
    UNCOOKEDBLUEBERRYMUFFINITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0.4f,0f,0f,3.5f,1f,480),
    UNCOOKEDBLUEBERRYPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.4f,0f,0f,3.5f,1f,480),
    UNCOOKEDBRIOCHEBUNITEM(GRAIN, 4,2f,0f,0.5f,0f,0f,0f,2f,2f,1f,480),
    UNCOOKEDBUTTERCOOKIEITEM(GRAIN, 4,1.1f,0f,0.5f,0f,0f,0f,0.5f,1.69f,1f,480),
    UNCOOKEDBUTTERTARTITEM(GRAIN, 4,1f,0f,0.65f,0f,0.5f,0.05f,0.5f,3f,1f,480),
    UNCOOKEDCARAMELCUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDCARROTCUPCAKEITEM(GRAIN, 4,2.5f,0f,0.5f,0.5f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDCHAOSCOOKIEITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0f,0f,0.1f,2f,1f,480),
    UNCOOKEDCHERRYPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.5f,0f,0f,3.5f,1f,480),
    UNCOOKEDCHICKENPOTPIEITEM(GRAIN, 4,2f,0f,0.5f,1.25f,0f,1.25f,0f,3.5f,1f,480),
    UNCOOKEDCHILICUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0.25f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDCHOCOLATECUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDCINNAMONBREADITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDCINNAMONROLLITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0f,0f,0f,2.21f,1f,480),
    UNCOOKEDCOFFEECUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDCOTTAGEPIEITEM(GRAIN, 4,3.5f,0f,0.5f,1.75f,0f,1f,0f,2.47f,1f,480),
    UNCOOKEDCRACKERITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0f,2f,1f,480),
    UNCOOKEDCRACKERSITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDCROISSANTITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDDAMPERITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2f,1f,480),
    UNCOOKEDEGGTARTITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0.4f,1f,2.76f,1f,480),
    UNCOOKEDFRUITCRUMBLEITEM(GRAIN, 4,1.15f,4.75f,0.5f,0f,0.42f,0f,0.5f,2.73f,1f,480),
    UNCOOKEDGARLICCHICKENITEM(GRAIN, 4,2f,0f,0f,2f,0f,1.25f,0f,3.82f,1f,480),
    UNCOOKEDGINGERBREADITEM(GRAIN, 4,1.2f,0f,0.5f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDGINGERSNAPSITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0f,0f,0f,2f,1f,480),
    UNCOOKEDGOOSEBERRYPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.5f,0f,0f,3.5f,1f,480),
    UNCOOKEDHONEYBUNITEM(GRAIN, 4,2f,0f,0.5f,0.75f,0f,0f,0.65f,2f,1f,480),
    UNCOOKEDHONEYLEMONLAMBITEM(GRAIN, 4,1.5f,0f,0f,0f,0.4f,0.75f,0f,3.65f,1f,480),
    UNCOOKEDHONEYSOYRIBSITEM(GRAIN, 4,2.5f,0f,0f,1.25f,0f,1.25f,0f,2.33f,1f,480),
    UNCOOKEDLAMBWITHMINTSAUCEITEM(GRAIN, 4,1.2f,0f,0f,0f,0f,0.75f,0f,3.82f,1f,480),
    UNCOOKEDLEMONCHICKENITEM(GRAIN, 4,1.5f,0f,0f,0f,0.4f,1.25f,0f,4.34f,1f,480),
    UNCOOKEDLEMONCUPCAKEITEM(GRAIN, 4,1.5f,5f,0.5f,0f,0.4f,0f,1f,2.33f,1f,480),
    UNCOOKEDMEATPIEITEM(GRAIN, 4,3f,0.36f,0.5f,2f,0f,2.25f,0f,2.33f,1f,480),
    UNCOOKEDMINCEPIEITEM(GRAIN, 4,2f,0f,0.5f,0f,0.42f,1.25f,0.5f,5.3f,1f,480),
    UNCOOKEDMINTCUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDMOCHICAKEITEM(GRAIN, 4,1.6f,5f,0.5f,0f,0f,0f,1.5f,2.07f,1f,480),
    UNCOOKEDORANGEDUCKITEM(GRAIN, 4,3f,10f,0f,1f,0.75f,0.75f,0f,3.82f,1f,480),
    UNCOOKEDPEAANDHAMSOUPITEM(GRAIN, 4,1f,0f,0.5f,0f,0.25f,0f,0f,2.8f,1f,480),
    UNCOOKEDPEANUTBUTTERCOOKIESITEM(GRAIN, 4,1f,0f,0.75f,0f,0f,0f,0f,1.54f,1f,480),
    UNCOOKEDPEANUTBUTTERCUPCAKEITEM(GRAIN, 4,2.5f,0f,0.75f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDPEKINGDUCKITEM(GRAIN, 4,1.9f,10f,1f,0.25f,0f,1.25f,0f,1.05f,1f,480),
    UNCOOKEDPIZZAITEM(GRAIN, 4,3f,0f,0.5f,1.25f,0f,1.25f,1.5f,3.23f,1f,480),
    UNCOOKEDPUMPKINBREADITEM(GRAIN, 4,1f,0f,0.5f,0.75f,0f,0f,0f,2f,1f,480),
    UNCOOKEDPUMPKINMUFFINITEM(GRAIN, 4,1f,0f,0.5f,0.75f,0f,0f,0f,3.5f,1f,480),
    UNCOOKEDPUMPKINOATSCONESITEM(GRAIN, 4,1.5f,0f,0.5f,0.75f,0f,0f,0f,2.02f,1f,480),
    UNCOOKEDPUMPKINPIEITEM(GRAIN, 4,0.5f,0f,0f,0.75f,0.75f,0f,0f,3.5f,1f,480),
    UNCOOKEDRAINBOWCURRYITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0.5f,0f,0f,2f,1f,480),
    UNCOOKEDRASPBERRYPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.5f,0f,0f,3.5f,1f,480),
    UNCOOKEDREDVELVETCUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDRICECAKEITEM(GRAIN, 4,0.5f,0f,0.5f,0f,0f,0f,0f,3.5f,1f,480),
    UNCOOKEDRIVERMUDCAKEITEM(GRAIN, 4,1f,0f,0.65f,0f,0f,0.05f,0.5f,2f,1f,480),
    UNCOOKEDROASTCHICKENITEM(GRAIN, 4,1f,0f,0f,0f,0f,1.25f,0f,3f,1f,480),
    UNCOOKEDROASTPOTATOESITEM(GRAIN, 4,1f,0f,0f,0.75f,0f,0f,0f,2.03f,1f,480),
    UNCOOKEDSALISBURYSTEAKITEM(GRAIN, 4,5f,0.36f,1.25f,1f,0f,2.25f,2.5f,3f,1f,480),
    UNCOOKEDSHEPARDSPIEITEM(GRAIN, 4,3f,0f,0.5f,1.75f,0f,0.75f,0f,3.5f,1f,480),
    UNCOOKEDSOFTPRETZELITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0f,3.43f,1f,480),
    UNCOOKEDSPINACHPIEITEM(GRAIN, 4,3f,0f,1.25f,0.5f,0f,0f,2f,2.33f,1f,480),
    UNCOOKEDSPRINKLESCUPCAKEITEM(GRAIN, 4,1.5f,0f,0.5f,0f,0f,0f,1f,2.33f,1f,480),
    UNCOOKEDSTRAWBERRYCUPCAKEITEM(GRAIN, 4,1.5f,10f,0.5f,0f,0.25f,0f,1f,2.33f,1f,480),
    UNCOOKEDSTRAWBERRYPIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0.25f,0f,0f,3.07f,1f,480),
    UNCOOKEDSTUFFEDDUCKITEM(GRAIN, 4,2.5f,0f,0f,2f,0.5f,0.75f,0f,3.5f,1f,480),
    UNCOOKEDSUGARCOOKIEITEM(GRAIN, 4,1f,0f,0.5f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDSUNFLOWERWHEATROLLSITEM(GRAIN, 4,0.9f,0f,0.5f,0f,0f,0f,0f,2.82f,1f,480),
    UNCOOKEDSWEETPOTATOPIEITEM(GRAIN, 4,1.5f,0f,0.5f,0.75f,0f,0f,0f,3.09f,1f,480),
    UNCOOKEDTIMPANOITEM(GRAIN, 4,3.5f,0f,1f,0.75f,0f,2.25f,0.5f,4.12f,1f,480),
    UNCOOKEDTIROPITAITEM(GRAIN, 4,2f,0f,0.5f,0f,0f,0.4f,1.5f,3.5f,1f,480),
    UNCOOKEDTOASTITEM(GRAIN, 4,1f,0f,0.75f,0f,0f,0f,0.5f,2f,1f,480),
    UNCOOKEDTOMATOHERBCHICKENITEM(GRAIN, 4,1.5f,0f,0f,0.75f,0f,1.25f,0f,3.82f,1f,480),
    UNCOOKEDVANILLACUPCAKEITEM(GRAIN, 4,1.6f,0f,0.5f,0f,0f,0f,1f,2.18f,1f,480);



    //Code from TFC modified a bit
    private final Food.Category category;
    private final FoodData foodData;
    private final Item item;

    private final boolean heatable;
    private final float heatCapacity;
    private final float cookingTemp;

    private final String[] oreDictNames;
    TPUncooked(@Nonnull Food.Category category, int hunger, float saturation, float water, float grain, float veg, float fruit, float meat, float dairy, float decayModifier, float heatCapacity, float cookingTemp, String... oreNames)
    {
        this.category = category;
        this.foodData = new FoodData(hunger, water, saturation, grain, fruit, veg, meat, dairy, decayModifier);
        this.item = new ItemPamFood(0,saturation);

        this.heatable = cookingTemp >= 0;
        this.heatCapacity = heatCapacity;
        this.cookingTemp = cookingTemp;

        this.oreDictNames = oreNames == null || oreNames.length == 0 ? null : oreNames;
    }

    @Nonnull
    public Food.Category getCategory()
    {
        return category;
    }

    @Nonnull
    public FoodData getData()
    {
        return foodData;
    }

    @Nonnull
    public Item getItem() {return item;}

    public boolean isHeatable()
    {
        return heatable;
    }

    public float getHeatCapacity()
    {
        return heatCapacity;
    }

    public float getCookingTemp()
    {
        return cookingTemp;
    }

    @Nullable
    public String[] getOreDictNames()
    {
        return oreDictNames;
    }

}
