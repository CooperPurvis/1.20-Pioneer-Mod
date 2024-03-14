package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PioneerMod.MODID);

    public static final RegistryObject<CreativeModeTab> PIONEER_TAB = CREATIVE_MODE_TABS.register("pioneer_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.RAW_RAINBOW_TROUT.get()))
                    .title(Component.translatable("creativetab.pioneer_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ItemInit.RAW_RAINBOW_TROUT.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

