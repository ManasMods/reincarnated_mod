package com.github.manasmods.tensura.command;

import com.github.manasmods.tensura.Tensura;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;

public class SetHomeCommand {
    public SetHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("home").then(Commands.literal("set").executes((command) -> {
            return setHome(command.getSource());
        })));
    }

    //TODO please use a Capability to store custom information in a Player Object!
    private int setHome(CommandSourceStack source) throws CommandSyntaxException {
        ServerPlayer player = source.getPlayerOrException();
        BlockPos playerPos = player.blockPosition();

        String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray(Tensura.MOD_ID + "homepos", new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ()});

        source.sendSuccess(new TextComponent("Set Home at " + pos), true);
        return 1;
    }
}