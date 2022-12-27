package land.alfred.createfood.fluid;

import land.alfred.createfood.CreateFoodRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class WhiteChocolateFluid extends ModFluid {

    @Override
    public Fluid getStill() {
        return CreateFoodRegistry.STILL_WHITE_CHOCOLATE_FLUID;
    }

    @Override
    public Fluid getFlowing() {
        return CreateFoodRegistry.FLOWING_WHITE_CHOCOLATE_FLUID;
    }

    @Override
    public Item getBucketItem() {
        return CreateFoodRegistry.BUCKET_OF_WHITE_CHOCOLATE;
    }

    @Override
    public BlockState toBlockState(FluidState state) {
        return CreateFoodRegistry.WHITE_CHOCOLATE.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public static class Flowing extends WhiteChocolateFluid {
        public Flowing() {
        }

        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

    public static class Still extends WhiteChocolateFluid {

        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }

}
