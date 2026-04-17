package com.github.alexporter7.util;

public class TextFormatUtil {
    
    /* Colors */
    public static final String BLACK = "§0";
    public static final String DARK_BLUE = "§1";
    public static final String DARK_GREEN = "§2";
    public static final String DARK_AQUA = "§3";
    public static final String DARK_RED = "§4";
    public static final String DARK_PURPLE = "§5";
    public static final String GOLD = "§6";
    public static final String GRAY = "§7";
    public static final String DARK_GRAY = "§8";
    public static final String BLUE = "§9";
    public static final String GREEN = "§a";
    public static final String AQUA = "§b";
    public static final String RED = "§c";
    public static final String LIGHT_PURPLE = "§d";
    public static final String YELLOW = "§e";
    public static final String WHITE = "§f";
    public static final String MINECOIN_GOLD = "§g";
    public static final String MATERIAL_QUARTZ = "§i";
    public static final String MATERIAL_NETHERITE = "§j";
    public static final String MATERIAL_REDSTONE = "§m";
    public static final String MATERIAL_COPPER = "§n";
    public static final String MATERIAL_GOLD = "§p";
    public static final String MATERIAL_EMERALD = "§q";
    public static final String MATERIAL_DIAMOND = "§s";
    public static final String MATERIAL_LAPIS = "§t";
    public static final String MATERIAL_AMETHYST = "§u";
    public static final String MATERIAL_RESIN = "§v";
    
    /* Format Codes */
    public static final String OBFUSCATED = "§k";
    public static final String BOLD = "§l";
    public static final String STRIKETHROUGH = "§m";
    public static final String UNDERLINE = "§n";
    public static final String ITALIC = "§o";
    public static final String RESET = "§r";
    public static final String RESET_ADD_COLO = "§r§f";
    
    public static String colorText(String color, String text) {
        return String.format("%s%s", color, text);
    }
}
