package com.borniuus.tensura.command;

import com.borniuus.tensura.Tensura;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;


public class ReturnHomeCommand {
    public ReturnHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("home").then(Commands.literal("return").executes((command) -> {
            return returnHome(command.getSource());
        })));
    }

    //TODO please use a Capability to store custom information in a Player Object!
    private int returnHome(CommandSourceStack source) throws CommandSyntaxException {
        ServerPlayer player = source.getPlayerOrException();
        boolean hasHomepos = player.getPersistentData().getIntArray(Tensura.MOD_ID + "homepos").length != 0;

        if (hasHomepos) {
            int[] playerPos = player.getPersistentData().getIntArray(Tensura.MOD_ID + "homepos");
            player.teleportTo(playerPos[0], playerPos[1], playerPos[2]);

            source.sendSuccess(new TextComponent("Player returned Home!"), true);
            return 1;
        } else {
            source.sendFailure(new TextComponent("No Home Position has been set."));
            return -1;
        }
    }
}