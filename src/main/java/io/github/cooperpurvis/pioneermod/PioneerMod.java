package io.github.cooperpurvis.pioneermod;

import io.github.cooperpurvis.pioneermod.block.BlockInit;
import io.github.cooperpurvis.pioneermod.init.*;
import io.github.cooperpurvis.pioneermod.world.feature.ConfiguredFeatureInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(PioneerMod.MODID)
public class PioneerMod {
    public static final String MODID = "pioneermod";

    //register the stuff
    public PioneerMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        PaintingInit.PAINTINGS.register(bus);
        ConfiguredFeatureInit.CONFIGURED_FEATURES.register(bus);
        PlacedFeatureInit.PLACED_FEATURES.register(bus);
    }

    //creative mode tab
    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COTTON.get().getDefaultInstance();
        }


    };
    @Mod.EventBusSubscriber(modid = MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            ItemBlockRenderTypes.setRenderLayer(BlockInit.BEAN_CROP.get(), RenderType.cutout());
            //net.minecraftforge.fml.splash.SplashProgress.addSplashes(CustomSplash.class);
        }
    }
}
