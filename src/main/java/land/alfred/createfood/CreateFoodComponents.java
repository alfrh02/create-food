package land.alfred.createfood;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class CreateFoodComponents {
    public static final FoodComponent BAR_OF_WHITE_CHOCOLATE;
    public static final FoodComponent WHITE_CHOCOLATE_GLAZED_BERRIES;
    public static final FoodComponent BUTTER;
    public static final FoodComponent COCOA_BUTTER;

    static {
        BAR_OF_WHITE_CHOCOLATE = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.3F).build();
        WHITE_CHOCOLATE_GLAZED_BERRIES = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.8F).build();
        BUTTER = (new FoodComponent.Builder()).hunger(2).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1), 0.85F).build();
        COCOA_BUTTER = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1), 0.75F).build();
    }
}
