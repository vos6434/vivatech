package ru.falseresync.vivatech.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import ru.falseresync.vivatech.client.registry.VTRenderers;
import ru.falseresync.vivatech.client.registry.VTScreens;

@Environment(EnvType.CLIENT)
public class VivatechClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VTScreens.register();
        VTRenderers.register();
    }
}
