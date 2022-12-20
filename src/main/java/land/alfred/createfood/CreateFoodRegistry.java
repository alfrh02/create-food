package land.alfred.createfood;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CreateFoodRegistry {
    public static Block TEST_BLOCK;
    public static BlockItem TEST_BLOCKITEM;

    public static void init() {
        TEST_BLOCK = registerBlock(new Block(Block.Settings.of(Material.STONE).strength(2.0f, 0.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)), "test_block");
        TEST_BLOCKITEM = registerBlockItem(new BlockItem(TEST_BLOCK, new FabricItemSettings().maxCount(16)), "test_block");
    }

    public static Block registerBlock(Block block, String name) {
        System.out.println("registering " + name);
        return Registry.register(Registry.BLOCK, new Identifier(CreateFood.MODID, name), block);
    }

    public static BlockItem registerBlockItem(BlockItem item, String name) {
        System.out.println("registering " + name);
        return Registry.register(Registry.ITEM, new Identifier(CreateFood.MODID, name), item);
    }
}
