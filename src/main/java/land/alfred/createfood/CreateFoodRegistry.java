package land.alfred.createfood;

import com.simibubi.create.Create;
import land.alfred.createfood.fluid.WhiteChocolateFluid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CreateFoodRegistry {

    public static Block TEST_BLOCK;
    public static BlockItem TEST_BLOCKITEM;

    public static Item BUTTER;
    public static Item COCOA_BUTTER;

    public static Item BAR_OF_WHITE_CHOCOLATE;
    public static Item WHITE_CHOCOLATE_GLAZED_BERRIES;
    public static Item BUCKET_OF_WHITE_CHOCOLATE;
    public static FlowableFluid STILL_WHITE_CHOCOLATE_FLUID;
    public static FlowableFluid FLOWING_WHITE_CHOCOLATE_FLUID;
    public static Block WHITE_CHOCOLATE;

    public static void init() {
        TEST_BLOCK = registerBlock(new Block(Block.Settings.of(Material.STONE).strength(2.0f, 0.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)), "test_block");
        TEST_BLOCKITEM = registerBlockItem(new BlockItem(TEST_BLOCK, new FabricItemSettings().maxCount(16).group(CreateFood.ITEM_GROUP)), "test_block");

        STILL_WHITE_CHOCOLATE_FLUID = registerFluid(new WhiteChocolateFluid.Still(), "still_white_chocolate");
        FLOWING_WHITE_CHOCOLATE_FLUID = registerFluid(new WhiteChocolateFluid.Flowing(), "flowing_white_chocolate");
        WHITE_CHOCOLATE = registerBlock(new FluidBlock(STILL_WHITE_CHOCOLATE_FLUID, FabricBlockSettings.copyOf(Blocks.WATER)), "white_chocolate");
        BUCKET_OF_WHITE_CHOCOLATE = registerItem(new BucketItem(STILL_WHITE_CHOCOLATE_FLUID, new Item.Settings().group(CreateFood.ITEM_GROUP).maxCount(1)), "white_chocolate_bucket");

        BAR_OF_WHITE_CHOCOLATE = registerItem(new Item(new Item.Settings().food(CreateFoodComponents.BAR_OF_WHITE_CHOCOLATE).group(CreateFood.ITEM_GROUP)), "bar_of_white_chocolate");
        WHITE_CHOCOLATE_GLAZED_BERRIES = registerItem(new Item(new Item.Settings().food(CreateFoodComponents.WHITE_CHOCOLATE_GLAZED_BERRIES).group(CreateFood.ITEM_GROUP)), "white_chocolate_glazed_berries");

        BUTTER = registerItem(new Item(new Item.Settings().food(CreateFoodComponents.BUTTER).group(CreateFood.ITEM_GROUP)), "butter");
        COCOA_BUTTER = registerItem(new Item(new Item.Settings().food(CreateFoodComponents.COCOA_BUTTER).group(CreateFood.ITEM_GROUP)), "cocoa_butter");
    }

    public static Block registerBlock(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(CreateFood.MODID, name), block);
    }

    public static BlockItem registerBlockItem(BlockItem item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFood.MODID, name), item);
    }

    public static Item registerItem(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFood.MODID, name), item);
    }

    public static FlowableFluid registerFluid(FlowableFluid fluid, String name) {
        return Registry.register(Registry.FLUID, new Identifier(CreateFood.MODID, name), fluid);
    }
}
