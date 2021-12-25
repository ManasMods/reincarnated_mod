package com.borniuus.tensura;

import com.borniuus.tensura.registry.TensuraRegistry;
import net.minecraftforge.eventbus.api.IEventBus;

public class TensuraCommon {
    public void preInit(IEventBus modBus) {
        TensuraRegistry.register(modBus);
    }

    /**
     * This Method is a save way to call client only Methods on Initialization.
     * Do not add any functionality here! Use TensuraClient instead.
     */
    public void clientInit() {}
}
