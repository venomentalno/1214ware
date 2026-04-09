package com.botclient;

import net.minecraft.util.Formatting;

/**
 * TextFormat utility class for Minecraft 1.21.4 Fabric
 * Replaces the old 1.12.x TextFormat/Formatting enum usage
 */
public class TextFormat {
    public static final TextFormat BLACK = new TextFormat(Formatting.BLACK);
    public static final TextFormat DARK_BLUE = new TextFormat(Formatting.DARK_BLUE);
    public static final TextFormat DARK_GREEN = new TextFormat(Formatting.DARK_GREEN);
    public static final TextFormat DARK_AQUA = new TextFormat(Formatting.DARK_AQUA);
    public static final TextFormat DARK_RED = new TextFormat(Formatting.DARK_RED);
    public static final TextFormat DARK_PURPLE = new TextFormat(Formatting.DARK_PURPLE);
    public static final TextFormat GOLD = new TextFormat(Formatting.GOLD);
    public static final TextFormat GRAY = new TextFormat(Formatting.GRAY);
    public static final TextFormat DARK_GRAY = new TextFormat(Formatting.DARK_GRAY);
    public static final TextFormat BLUE = new TextFormat(Formatting.BLUE);
    public static final TextFormat GREEN = new TextFormat(Formatting.GREEN);
    public static final TextFormat AQUA = new TextFormat(Formatting.AQUA);
    public static final TextFormat RED = new TextFormat(Formatting.RED);
    public static final TextFormat LIGHT_PURPLE = new TextFormat(Formatting.LIGHT_PURPLE);
    public static final TextFormat YELLOW = new TextFormat(Formatting.YELLOW);
    public static final TextFormat WHITE = new TextFormat(Formatting.WHITE);
    public static final TextFormat OBFUSCATED = new TextFormat(Formatting.OBFUSCATED);
    public static final TextFormat BOLD = new TextFormat(Formatting.BOLD);
    public static final TextFormat STRIKETHROUGH = new TextFormat(Formatting.STRIKETHROUGH);
    public static final TextFormat UNDERLINE = new TextFormat(Formatting.UNDERLINE);
    public static final TextFormat ITALIC = new TextFormat(Formatting.ITALIC);
    public static final TextFormat RESET = new TextFormat(Formatting.RESET);

    private final Formatting formatting;

    private TextFormat(Formatting formatting) {
        this.formatting = formatting;
    }

    public Formatting getFormatting() {
        return formatting;
    }

    @Override
    public String toString() {
        return formatting.toString();
    }

    /**
     * Get TextFormat from color index (0-15)
     */
    public static TextFormat fromColorIndex(int index) {
        switch (index) {
            case 0: return BLACK;
            case 1: return DARK_BLUE;
            case 2: return DARK_GREEN;
            case 3: return DARK_AQUA;
            case 4: return DARK_RED;
            case 5: return DARK_PURPLE;
            case 6: return GOLD;
            case 7: return GRAY;
            case 8: return DARK_GRAY;
            case 9: return BLUE;
            case 10: return GREEN;
            case 11: return AQUA;
            case 12: return RED;
            case 13: return LIGHT_PURPLE;
            case 14: return YELLOW;
            case 15: return WHITE;
            default: return RESET;
        }
    }
}
