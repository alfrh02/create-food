package land.alfred.createfood;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class CreateFoodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(CreateFoodRegistry.STILL_WHITE_CHOCOLATE_FLUID, CreateFoodRegistry.FLOWING_WHITE_CHOCOLATE_FLUID, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_still"),
                new Identifier("createfood:block/white_chocolate_flow")
        ));

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("createfood:block/white_chocolate_still"));
            registry.register(new Identifier("createfood:block/white_chocolate_flow"));
        });
    }
}
