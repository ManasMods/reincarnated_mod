package com.borniuus.tensura.world.tree.trunk;

import com.borniuus.tensura.registry.TensuraTrunkPlaceRegistry;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class PalmTrunkPlacer extends TrunkPlacer {
    public static final Codec<PalmTrunkPlacer> CODEC = RecordCodecBuilder.create((p_70261_) -> trunkPlacerParts(p_70261_).apply(p_70261_, PalmTrunkPlacer::new));

    public PalmTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TensuraTrunkPlaceRegistry.PALM_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom,
                                                            int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        int randomNumber = pRandom.nextInt(5 - 1) + 1;
        Direction treeDirection = switch (randomNumber) {
            case 1 -> Direction.NORTH;
            case 2 -> Direction.EAST;
            case 3 -> Direction.SOUTH;
            case 4 -> Direction.WEST;
            default -> throw new IllegalStateException("Calculated " + randomNumber + " but it should be between 1 and 4");
        };

        int currentHeight = 1;
        BlockPos lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pPos, pConfig);
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, lastPos.relative(treeDirection), pConfig);
        lastPos = placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight++);
        lastPos = placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight++);
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, lastPos.relative(treeDirection), pConfig);
        lastPos = placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight++);
        lastPos = placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight++);
        lastPos = placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight++);
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, lastPos.relative(treeDirection), pConfig);
        while (!lastPos.equals(placeAndContinueIf(pLevel, pBlockSetter, pRandom, lastPos.above(), pConfig, pFreeTreeHeight, currentHeight))) {
            //Generating until max height is reached
            currentHeight++;
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(lastPos.above().above(), 0, false));
    }

    private static BlockPos placeAndContinue(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom, BlockPos pPos, TreeConfiguration pConfig) {
        placeLog(pLevel, pBlockSetter, pRandom, pPos, pConfig);
        return pPos;
    }

    private static BlockPos placeAndContinueIf(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom, BlockPos pPos,
                                               TreeConfiguration pConfig, int maxHeight, int allowedHeight) {
        if (maxHeight >= allowedHeight) {
            return placeAndContinue(pLevel, pBlockSetter, pRandom, pPos, pConfig);
        } else {
            return pPos.below();
        }
    }
}
