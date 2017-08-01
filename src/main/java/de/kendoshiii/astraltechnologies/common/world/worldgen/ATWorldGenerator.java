package de.kendoshiii.astraltechnologies.common.world.worldgen;

import java.util.Random;

import de.kendoshiii.astraltechnologies.common.config.ConfigValues;
import de.kendoshiii.astraltechnologies.core.InitBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ATWorldGenerator implements IWorldGenerator{

    private WorldGenerator oreAstraliumGen;
    private WorldGenerator oreLunariumGen;
    private WorldGenerator orePyriumGen;
    private WorldGenerator oreSolariumGen;
    private WorldGenerator oreVoidiumGen;


	public ATWorldGenerator() {

        oreAstraliumGen = new WorldGenMinable(InitBlocks.oreAstralium.getDefaultState(), ConfigValues.oreSize[0], BlockMatcher.forBlock(Blocks.STONE));
        oreLunariumGen = new WorldGenMinable(InitBlocks.oreLunarium.getDefaultState(), ConfigValues.oreSize[1], BlockMatcher.forBlock(Blocks.STONE));
        orePyriumGen = new WorldGenMinable(InitBlocks.orePyrium.getDefaultState(), ConfigValues.oreSize[2], BlockMatcher.forBlock(Blocks.NETHERRACK));
        oreSolariumGen = new WorldGenMinable(InitBlocks.oreSolarium.getDefaultState(), ConfigValues.oreSize[3], BlockMatcher.forBlock(Blocks.STONE));
        oreVoidiumGen = new WorldGenMinable(InitBlocks.oreVoidium.getDefaultState(), ConfigValues.oreSize[4], BlockMatcher.forBlock(Blocks.END_STONE));

    }

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
        if(world.provider.getDimension() == 0){
            for(int i = 0; i < ConfigValues.oreRarity[0]; i++){

                int x = chunkX * 16 + random.nextInt(16);
                int z = chunkZ * 16 + random.nextInt(16);

                this.oreAstraliumGen.generate(world, random, new BlockPos(x, 0 + random.nextInt(64), z));
                this.oreLunariumGen.generate(world, random, new BlockPos(x, 0 + random.nextInt(40), z));
                this.oreSolariumGen.generate(world, random, new BlockPos(x, 0 + random.nextInt(16), z));


            }
        }else if(world.provider.getDimension() == 1){

            for(int i = 0; i < ConfigValues.oreRarity[1]; i++){

                int x = chunkX * 16 + random.nextInt(16);
                int z = chunkZ * 16 + random.nextInt(16);

                this.oreVoidiumGen.generate(world, random, new BlockPos(x, 40 + random.nextInt(30), z));

            }

        }else if(world.provider.getDimension() == -1){

            for(int i = 0; i < ConfigValues.oreRarity[2]; i++){

                int x = chunkX * 16 + random.nextInt(16);
                int z = chunkZ * 16 + random.nextInt(16);

                this.orePyriumGen.generate(world, random, new BlockPos(x, 0 + random.nextInt(128), z));

            }

        }
	}



	
}
