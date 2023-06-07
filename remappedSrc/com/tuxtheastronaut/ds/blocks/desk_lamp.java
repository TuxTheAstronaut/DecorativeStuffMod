package com.tuxtheastronaut.ds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class desk_lamp extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public desk_lamp(Settings settings) { super(settings); }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(7, 12, 5, 7, 14, 11),
            Block.createCuboidShape(5, 0, 6, 11, 1, 10),
            Block.createCuboidShape(7, 1, 7, 9, 3, 9),
            Block.createCuboidShape(6.5, 3, 6.5, 9.5, 6, 9.5),
            Block.createCuboidShape(7.5, 6, 7.5, 8.5, 8, 8.5),
            Block.createCuboidShape(4.5, 8, 7.5, 8.5, 9, 8.5),
            Block.createCuboidShape(4.5, 9, 7.5, 5.5, 16, 8.5),
            Block.createCuboidShape(4.5, 16, 7.5, 10.5, 17, 8.5),
            Block.createCuboidShape(9, 10, 7, 11, 16, 9),
            Block.createCuboidShape(7, 14, 5, 13, 14, 11),
            Block.createCuboidShape(7, 12, 11, 13, 14, 11),
            Block.createCuboidShape(7, 12, 5, 13, 14, 5),
            Block.createCuboidShape(13, 12, 5, 13, 14, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(9, 12, 5, 9, 14, 11),
            Block.createCuboidShape(5, 0, 6, 11, 1, 10),
            Block.createCuboidShape(7, 1, 7, 9, 3, 9),
            Block.createCuboidShape(6.5, 3, 6.5, 9.5, 6, 9.5),
            Block.createCuboidShape(7.5, 6, 7.5, 8.5, 8, 8.5),
            Block.createCuboidShape(7.5, 8, 7.5, 11.5, 9, 8.5),
            Block.createCuboidShape(10.5, 9, 7.5, 11.5, 16, 8.5),
            Block.createCuboidShape(5.5, 16, 7.5, 11.5, 17, 8.5),
            Block.createCuboidShape(5, 10, 7, 7, 16, 9),
            Block.createCuboidShape(3, 14, 5, 9, 14, 11),
            Block.createCuboidShape(3, 12, 5, 9, 14, 5),
            Block.createCuboidShape(3, 12, 11, 9, 14, 11),
            Block.createCuboidShape(3, 12, 5, 3, 14, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(5, 12, 7, 11, 14, 7),
            Block.createCuboidShape(6, 0, 5, 10, 1, 11),
            Block.createCuboidShape(7, 1, 7, 9, 3, 9),
            Block.createCuboidShape(6.5, 3, 6.5, 9.5, 6, 9.5),
            Block.createCuboidShape(7.5, 6, 7.5, 8.5, 8, 8.5),
            Block.createCuboidShape(7.5, 8, 4.5, 8.5, 9, 8.5),
            Block.createCuboidShape(7.5, 9, 4.5, 8.5, 16, 5.5),
            Block.createCuboidShape(7.5, 16, 4.5, 8.5, 17, 10.5),
            Block.createCuboidShape(7, 10, 9, 9, 16, 11),
            Block.createCuboidShape(5, 14, 7, 11, 14, 13),
            Block.createCuboidShape(5, 12, 7, 5, 14, 13),
            Block.createCuboidShape(11, 12, 7, 11, 14, 13),
            Block.createCuboidShape(5, 12, 13, 11, 14, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(5, 12, 9, 11, 14, 9),
            Block.createCuboidShape(6, 0, 5, 10, 1, 11),
            Block.createCuboidShape(7, 1, 7, 9, 3, 9),
            Block.createCuboidShape(6.5, 3, 6.5, 9.5, 6, 9.5),
            Block.createCuboidShape(7.5, 6, 7.5, 8.5, 8, 8.5),
            Block.createCuboidShape(7.5, 8, 7.5, 8.5, 9, 11.5),
            Block.createCuboidShape(7.5, 9, 10.5, 8.5, 16, 11.5),
            Block.createCuboidShape(7.5, 16, 5.5, 8.5, 17, 11.5),
            Block.createCuboidShape(7, 10, 5, 9, 16, 7),
            Block.createCuboidShape(5, 14, 3, 11, 14, 9),
            Block.createCuboidShape(11, 12, 3, 11, 14, 9),
            Block.createCuboidShape(5, 12, 3, 5, 14, 9),
            Block.createCuboidShape(5, 12, 3, 11, 14, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerLookDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
