package land.alfred.createfood;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateFood implements ModInitializer {
    public static final String MODID = "createfood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitialize() {
        System.out.println("Helo");
        CreateFoodRegistry.init();
    }
}
