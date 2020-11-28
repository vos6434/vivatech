package ru.falseresync.vivatech.client.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import ru.falseresync.vivatech.client.screen.AlloyerScreen;
import ru.falseresync.vivatech.common.registry.VTScreenHandlers;

@Environment(EnvType.CLIENT)
public class VTScreens {
    public static void register() {
        ScreenRegistry.register(VTScreenHandlers.ALLOYER, AlloyerScreen::new);
    }
}
