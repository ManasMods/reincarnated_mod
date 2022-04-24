package com.borniuus.tensura;

import com.borniuus.tensura.handler.PlayerLogInHandler;
import com.borniuus.tensura.registry.TensuraRegistry;
import com.borniuus.tensura.world.ores.TensuraOreFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class TensuraCommon {
    public void preInit(final IEventBus modEventBus) {
        TensuraRegistry.register(modEventBus);

        final IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        PlayerLogInHandler.register(forgeEventBus);
    }

    public void init(final FMLCommonSetupEvent e) {
        //Register our Ore generation
        e.enqueueWork(TensuraOreFeatures::register);
    }

    /**
     * This Method is a save way to call client only Methods on Initialization.
     * Do not add any functionality here! Use TensuraClient instead.
     */
    public void clientInit() {}
}
