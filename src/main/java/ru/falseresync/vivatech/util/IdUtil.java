package ru.falseresync.vivatech.util;

import net.minecraft.util.Identifier;
import ru.falseresync.vivatech.common.VTConstants;

public class IdUtil {
    public static Identifier id(String id) {
        return new Identifier(VTConstants.MOD_ID, id);
    }
}
