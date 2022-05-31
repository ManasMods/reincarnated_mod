package com.github.manasmods.tensura.world.tree.leaves;

import com.mojang.datafixers.Products;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

import java.util.Random;
import java.util.function.BiConsumer;

public class PalmFoliagePlacer extends FoliagePlacer {
    public static final Codec<PalmFoliagePlacer> CODEC = RecordCodecBuilder.create((p_68427_) -> palmParts(p_68427_).apply(p_68427_, PalmFoliagePlacer::new));

    protected static <P extends PalmFoliagePlacer> Products.P3<RecordCodecBuilder.Mu<P>, IntProvider, IntProvider, Integer> palmParts(RecordCodecBuilder.Instance<P> p_68414_) {
        return foliagePlacerParts(p_68414_).and(Codec.intRange(0, 16).fieldOf("height").forGetter((placer) -> placer.height));
    }

    protected final int height;

    public PalmFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<PalmFoliagePlacer> type() {
        return TensuraFoliagePlacers.PALM_FOLIAGE_PLACER;
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom, TreeConfiguration pConfig,
                                 int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        BlockPos lastPos;
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().north());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().east());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().south());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().west());
        //inner cycle
        cycleAround(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below());
        //North
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().north(2));
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north());
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north().below());
        //East
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().east(2));
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.east());
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.east().below());
        //South
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().south(2));
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.south());
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.south().below());
        //West
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().west(2));
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west());
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west().below());
        //North-East
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().north(2).east(2));
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north().east().below());
        //South-East
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().east(2).south(2));
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.east().south().below());
        //South-West
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().west(2).south(2));
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west().south().below());
        //North-East
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().below().west(2).north(2));
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west().north().below());
    }

    private void cycleAround(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom, TreeConfiguration pConfig, BlockPos pPos) {
        BlockPos lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, pPos);
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.east());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.south());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.south());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.west());
        lastPos = placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north());
        placeAndContinue(pLevel, pBlockSetter, pRandom, pConfig, lastPos.north());
    }

    private static BlockPos placeAndContinue(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, Random pRandom, TreeConfiguration pConfig, BlockPos pPos) {
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pPos);
        return pPos;
    }

    @Override
    public int foliageHeight(Random pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(Random pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        return false;
    }
}
