package io.github.cooperpurvis.pioneermod;

import io.github.cooperpurvis.pioneermod.init.BlockInit;
import io.github.cooperpurvis.pioneermod.init.ItemInit;
import io.github.cooperpurvis.pioneermod.init.PaintingInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PioneerMod.MODID)
public class PioneerMod {
    public static final String MODID = "pioneermod";

    //register the stuff
    public PioneerMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        PaintingInit.PAINTINGS.register(bus);

    }

    //creative mode tab
    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COTTON.get().getDefaultInstance();
        }


    };
}
