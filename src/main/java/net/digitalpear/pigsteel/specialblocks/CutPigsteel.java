package net.digitalpear.pigsteel.specialblocks;

import net.digitalpear.pigsteel.PigsteelMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class CutPigsteel extends Block{

    public CutPigsteel(Settings settings) {
        super(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE).ticksRandomly());
    }
    @Override

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isClient) {
            if (world.getDimension().isBedWorking()) {
                world.setBlockState(pos, PigsteelMod.INFECTED_CUT_PIGSTEEL.getDefaultState());
            }

        }
    }
}
