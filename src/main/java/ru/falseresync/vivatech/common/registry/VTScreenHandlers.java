package ru.falseresync.vivatech.common.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import ru.falseresync.vivatech.common.screen.AlloyerScreenHandler;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTScreenHandlers {
    public static final ScreenHandlerType<AlloyerScreenHandler> ALLOYER;

    static {
        ALLOYER = ScreenHandlerRegistry.registerSimple(id("alloyer"), AlloyerScreenHandler::new);
    }

    public static void register() {
        // Because vanilla likes encapsulated classes where least needed, registration == creation
    }
}
