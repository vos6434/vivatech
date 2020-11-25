package ru.falseresync.vivatech;

import net.fabricmc.api.ModInitializer;
import ru.falseresync.vivatech.registry.VTBlockEntities;
import ru.falseresync.vivatech.registry.VTBlocks;
import ru.falseresync.vivatech.registry.VTItems;
import ru.falseresync.vivatech.registry.VTWorldGen;

public class Vivatech implements ModInitializer {
    public static final String MOD_ID = "vivatech";

    @Override
    public void onInitialize() {
        VTBlocks.register();
        VTBlockEntities.register();
        VTItems.register();
        VTWorldGen.register();
    }
}
