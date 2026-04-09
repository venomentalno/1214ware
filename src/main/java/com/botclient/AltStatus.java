package com.botclient;

import net.minecraft.text.Formatting;

public enum AltStatus {
    Working(TextFormat.GREEN + "Working"),
    Banned(TextFormat.RED + "Banned"),
    Unchecked(TextFormat.YELLOW + "Unchecked"),
    NotWorking(TextFormat.RED + "Not Working");

    public final String formatted;

    AltStatus(String formatted) {
        this.formatted = formatted;
    }

    public String toFormatted() {
        return this.formatted;
    }
}
