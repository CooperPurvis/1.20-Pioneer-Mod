package io.github.cooperpurvis.pioneermod.datagen;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.block.BlockInit;
import io.github.cooperpurvis.pioneermod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PioneerMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                ;


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                ;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                ;

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                ;

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                ;



        this.tag(BlockTags.FENCES)
                .add(BlockInit.REDWOOD_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(BlockInit.REDWOOD_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.REDWOOD_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(BlockInit.REDWOOD_PLANKS.get());
    }
}