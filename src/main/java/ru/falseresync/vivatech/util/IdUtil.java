package ru.falseresync.vivatech.util;

import net.minecraft.util.Identifier;
import ru.falseresync.vivatech.Vivatech;

public class IdUtil {
    public static Identifier id(String id) {
        return new Identifier(Vivatech.MOD_ID, id);
    }
}
