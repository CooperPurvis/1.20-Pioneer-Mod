package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.AcaciaTreeGrower;
import net.minecraft.world.level.block.grower.DarkOakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    //block registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PioneerMod.MODID);
    //blocks go here
    public static final RegistryObject<Block> REDWOOD_PLANKS = register("redwood_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)),
            new Item.Properties().tab(PioneerMod.TAB));
    public static final RegistryObject<Block> OVERWORLD_FOOLS_ORE = register("overworld_fools_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)),
            new Item.Properties().tab(PioneerMod.TAB));
   // public static final RegistryObject<Block> REDWOOD_SAPLING = register("redwood_sapling",
   //         () -> new SaplingBlock(new DarkOakTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
