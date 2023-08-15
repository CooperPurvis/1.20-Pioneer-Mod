package io.github.cooperpurvis.pioneermod.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;

import java.util.function.Supplier;

public class ModStairBlock extends StairBlock {

    public ModStairBlock(java.util.function.Supplier<BlockState> state, BlockBehaviour.Properties properties) {
        super(state,properties);

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HALF, Half.BOTTOM).setValue(SHAPE, StairsShape.STRAIGHT).setValue(WATERLOGGED, Boolean.valueOf(false)));
        Block base = Blocks.AIR; // These are unused, fields are redirected
        BlockState baseState = Blocks.AIR.defaultBlockState();
    }
}
