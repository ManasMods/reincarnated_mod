package com.github.manasmods.tensura.block;

import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class TensuraSapling extends SaplingBlock {
    public TensuraSapling(AbstractTreeGrower treeGrower) {
        super(treeGrower, BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS));
    }
}
