package com.github.manasmods.tensura.handler;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class PlayerLogInHandler {

    public static void onPlayerLogIn (final PlayerEvent.PlayerLoggedInEvent e) {

    }

    public static void register(IEventBus eventBus) {
        eventBus.addListener(PlayerLogInHandler::onPlayerLogIn);
    }

    //public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
        //if (event.getObject() instanceof Player) {
            //if (!event.getObject().getCapability(

                    //TODO Need to add capability where player is given a book when they first join the world.
        }

