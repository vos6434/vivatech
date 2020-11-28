package ru.falseresync.vivatech.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import ru.falseresync.vivatech.client.model.AutomatonModel;
import ru.falseresync.vivatech.common.entity.AutomatonEntity;

public class AutomatonEntityRenderer extends MobEntityRenderer<AutomatonEntity, AutomatonModel> {
    public AutomatonEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new AutomatonModel(), /* shadowRadius: */ 0.5f );
    }

    @Override
    public Identifier getTexture(AutomatonEntity entity) {
        return null;
    }
}
