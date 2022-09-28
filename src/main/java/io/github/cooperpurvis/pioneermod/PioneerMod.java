package io.github.cooperpurvis.pioneermod;

import io.github.cooperpurvis.pioneermod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PioneerMod.MODID)
public class PioneerMod {
    public static final String MODID = "pioneermod";

    //register the ItemRegistry
    public PioneerMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);

    }
}
