package ru.falseresync.vivatech.client.registry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import ru.falseresync.vivatech.client.renderer.entity.AutomatonEntityRenderer;
import ru.falseresync.vivatech.common.registry.VTEntities;

@Environment(EnvType.CLIENT)
public class VTRenderers {
    public static void register() {
        EntityRendererRegistry.INSTANCE.register(VTEntities.AUTOMATON, (dispatcher, context) -> new AutomatonEntityRenderer(dispatcher));
    }
}
