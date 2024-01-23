package io.github.cooperpurvis.pioneermod;

import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.resources.SplashManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.RandomSource;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@OnlyIn(Dist.CLIENT)
public class CustomSplashHandler extends SplashManager {
    private static final ResourceLocation SPLASHES_LOCATION = new ResourceLocation("assets/pioneermod/texts/pioneersplashes.txt");
    private static final RandomSource RANDOM = RandomSource.create();
    private final List<String> splashes = Lists.newArrayList();
    private final User user;

    public CustomSplashHandler(User p_118866_) {
        super(p_118866_);
        this.user = p_118866_;
    }
    protected List<String> prepare(ResourceManager p_118869_, ProfilerFiller p_118870_) {
        try {
            BufferedReader bufferedreader = Minecraft.getInstance().getResourceManager().openAsReader(SPLASHES_LOCATION);

            List list;
            try {
                list = bufferedreader.lines().map(String::trim).filter((p_118876_) -> {
                    return p_118876_.hashCode() != 125780783;
                }).collect(Collectors.toList());
            } catch (Throwable throwable1) {
                if (bufferedreader != null) {
                    try {
                        bufferedreader.close();
                    } catch (Throwable throwable) {
                        throwable1.addSuppressed(throwable);
                    }
                }

                throw throwable1;
            }

            if (bufferedreader != null) {
                bufferedreader.close();
            }

            return list;
        } catch (IOException ioexception) {
            return Collections.emptyList();
        }
    }
    protected void apply(@NotNull List<String> splashes, @NotNull ResourceManager SPLASHES_LOCATION, @NotNull ProfilerFiller user) {
        this.splashes.clear();
        this.splashes.addAll(splashes);

    }

}