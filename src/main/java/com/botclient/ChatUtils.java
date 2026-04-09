/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  neo.deobf.MinecraftContext
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
package com.botclient;

import com.botclient.MinecraftContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.Text;
import net.minecraft.text.Text;

public class ChatUtils
implements MinecraftContext {

    public static void formatMsg(String message) {
        if ((MinecraftClient.getInstance().ingameGUI) != null) {
            (MinecraftClient.getInstance().ingameGUI).getChatGUI().printChatMessage((ITextComponent)new TextComponentString("§d§lNeo§f§lWare §d§l• §f§l" + message.replace("&", "§")));
        }
    }

    public static void defaultMsg(String message) {
        if ((MinecraftClient.getInstance().ingameGUI) != null) {
            (MinecraftClient.getInstance().ingameGUI).getChatGUI().printChatMessage((ITextComponent)new TextComponentString(message.replace("&", "§")));
        }
    }
}

