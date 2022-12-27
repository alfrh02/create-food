package land.alfred.createfood;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreateFood implements ModInitializer {
    public static final String MODID = "createfood";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "general"), () -> new ItemStack((CreateFoodRegistry.BAR_OF_WHITE_CHOCOLATE)));

    @Override
    public void onInitialize() {
        System.out.println("CreateFood Initialised!");
        CreateFoodRegistry.init();
    }
}
