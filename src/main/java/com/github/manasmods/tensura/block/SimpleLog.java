package com.github.manasmods.tensura.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class SimpleLog extends RotatedPillarBlock {
    public SimpleLog(MaterialColor topColor, MaterialColor sideColor) {
        super(BlockBehaviour.Properties.of(Material.WOOD, blockState -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? topColor : sideColor).strength(2.0F).sound(SoundType.WOOD));
    }
}
