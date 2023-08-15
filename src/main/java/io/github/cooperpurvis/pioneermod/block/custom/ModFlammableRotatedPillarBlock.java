package io.github.cooperpurvis.pioneermod.block.custom;

import io.github.cooperpurvis.pioneermod.block.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties p_55926_) {
        super(p_55926_);
    }


    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    //stripping
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem){
            if(state.is(BlockInit.REDWOOD_LOG.get())){
                return BlockInit.STRIPPED_REDWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                //makes sure the orientation of the log is the same when stripped
            }
            if(state.is(BlockInit.REDWOOD_LOG.get())){
                return BlockInit.STRIPPED_REDWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return null;
    }
}
