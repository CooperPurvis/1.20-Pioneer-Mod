package io.github.cooperpurvis.pioneermod.block;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.block.custom.*;
import io.github.cooperpurvis.pioneermod.init.ItemInit;
import io.github.cooperpurvis.pioneermod.world.feature.tree.PineTreeGrower;
import io.github.cooperpurvis.pioneermod.world.feature.tree.RedwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class BlockInit {
    //block registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PioneerMod.MODID);
    //blocks go here
    //maple set
    //pine set
    public static final RegistryObject<Block> PINE_SLAB = register("pine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD))
            , new Item.Properties().tab(PioneerMod.TAB));
    //todo fix blockstate
    public static final RegistryObject<Block> PINE_FENCE = register("pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD))
            , new Item.Properties().tab(PioneerMod.TAB));
    public static final RegistryObject<Block> PINE_PLANKS = register("pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
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
                    return 20;
                }
            }, new Item.Properties().tab(PioneerMod.TAB));
//    public static final RegistryObject<Block> PINE_STAIRS = register("pine_stairs",
//            () -> new ModStairBlock()), new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> PINE_LOG = register("pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> PINE_WOOD = register("pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> STRIPPED_PINE_LOG = register("stripped_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = register("stripped_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            new Item.Properties().tab(PioneerMod.TAB));
    //todo fix leaves decaying after growth and grey
    public static final RegistryObject<Block> PINE_LEAVES = register("pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, new Item.Properties().tab(PioneerMod.TAB));
    //todo fix cutout
    public static final RegistryObject<Block> PINE_SAPLING = register("pine_sapling",
            () -> new SaplingBlock(new PineTreeGrower(),(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS))),
            new Item.Properties().tab(PioneerMod.TAB));
    //redwood set
    public static final RegistryObject<Block> REDWOOD_SLAB = register("redwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD))
            , new Item.Properties().tab(PioneerMod.TAB));
                //todo fix blockstate
    public static final RegistryObject<Block> REDWOOD_FENCE = register("redwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD))
            , new Item.Properties().tab(PioneerMod.TAB));
    public static final RegistryObject<Block> REDWOOD_PLANKS = register("redwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
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
                    return 20;
                }
            }, new Item.Properties().tab(PioneerMod.TAB));
//    public static final RegistryObject<Block> REDWOOD_STAIRS = register("redwood_stairs",
//            () -> new ModStairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS))
//            , new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> REDWOOD_LOG = register("redwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> REDWOOD_WOOD = register("redwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = register("stripped_redwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            new Item.Properties().tab(PioneerMod.TAB));

    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = register("stripped_redwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            new Item.Properties().tab(PioneerMod.TAB));
                //todo fix leaves decaying after growth and grey
    public static final RegistryObject<Block> REDWOOD_LEAVES = register("redwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, new Item.Properties().tab(PioneerMod.TAB));
                //todo fix cutout
    public static final RegistryObject<Block> REDWOOD_SAPLING = register("redwood_sapling",
            () -> new SaplingBlock(new RedwoodTreeGrower(),(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS))),
            new Item.Properties().tab(PioneerMod.TAB));
    //todo add redwood door, trapdoor, boat, chestboat, button, fence gate, pressure plate, sign

    //ores
    public static final RegistryObject<Block> OVERWORLD_FOOLS_ORE = register("overworld_fools_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.0F, 1.0F)),
            new Item.Properties().tab(PioneerMod.TAB));
    public static final RegistryObject<Block> DEEPSLATE_FOOLS_ORE = register("deepslate_fools_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.0F, 1.0F)),
            new Item.Properties().tab(PioneerMod.TAB));

    //shroom
    public static final RegistryObject<Block> MOREL = register("morel",
            () -> new MorelBlock(BlockBehaviour.Properties.of(Material.PLANT).dynamicShape().noOcclusion())
            , new Item.Properties().tab(PioneerMod.TAB));
    public static final RegistryObject<Block> CHANTERELLES = register("chanterelles",
            () -> new ChanterellesBlock(BlockBehaviour.Properties.of(Material.PLANT).dynamicShape().noOcclusion())
            , new Item.Properties().tab(PioneerMod.TAB));
    //crops
    public static final RegistryObject<Block> BEAN_CROP = register("bean_crop",
            () -> new BeanCropBlock(BlockBehaviour.Properties.of(Material.PLANT)), new Item.Properties().tab(PioneerMod.TAB));

    //register
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
    //tags
    public static class Tags {
        public static final TagKey<Block> NEEDS_COPPER_TOOL = create("mineable/needs_copper_tool");

        private static TagKey<Block> create(String location) {
            return BlockTags.create(new ResourceLocation(PioneerMod.MODID, location));
        }

    }

}

