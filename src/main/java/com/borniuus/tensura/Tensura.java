package com.borniuus.tensura;

import com.borniuus.tensura.registry.TensuraRegistry;
import com.borniuus.tensura.util.ModSoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Tensura.MOD_ID)
public class Tensura {
    public static final String MOD_ID = "tensura";
    private static final Logger LOGGER = LogManager.getLogger();

    public Tensura() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TensuraRegistry.register(modEventBus);

        ModSoundEvents.register(modEventBus);

        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    /**
     * Public Getter for the Logger instance of this mod.
     *
     * @return the current Logger instance
     */
    public static Logger getLogger() {
        return LOGGER;
    }
}


