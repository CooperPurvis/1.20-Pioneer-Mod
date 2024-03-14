package io.github.cooperpurvis.pioneermod;

import com.mojang.logging.LogUtils;
import io.github.cooperpurvis.pioneermod.block.BlockInit;
import io.github.cooperpurvis.pioneermod.init.*;
import io.github.cooperpurvis.pioneermod.loot.ModLoadModifier;
import io.github.cooperpurvis.pioneermod.world.feature.ConfiguredFeatureInit;
import io.github.cooperpurvis.pioneermod.world.feature.tree.FoliagePlacerInit;
import io.github.cooperpurvis.pioneermod.world.feature.tree.TrunkPlacerTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(PioneerMod.MODID)
public class PioneerMod {
    public static final String MODID = "pioneermod";
    public static final Logger LOGGER = LogUtils.getLogger();

    //register the stuff
    public PioneerMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        PaintingInit.PAINTINGS.register(bus);

        TrunkPlacerTypes.register(bus);
        FoliagePlacerInit.register(bus);
        //PlacedFeatureInit.PLACED_FEATURES.register(bus);
        ModLoadModifier.register(bus);


        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::addCreative);

    }

    //creative mode tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ItemInit.RAW_RAINBOW_TROUT);

        }
    }
    @Mod.EventBusSubscriber(modid = MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            //ItemBlockRenderTypes.setRenderLayer(BlockInit.BEAN_CROP.get(), RenderType.cutout());
            //net.minecraftforge.fml.splash.SplashProgress.addSplashes(CustomSplash.class);
        }
    }

}
