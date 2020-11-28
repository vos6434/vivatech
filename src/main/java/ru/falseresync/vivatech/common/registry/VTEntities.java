package ru.falseresync.vivatech.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;
import ru.falseresync.vivatech.common.entity.AutomatonEntity;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTEntities {
    public static EntityType<AutomatonEntity> AUTOMATON;

    static {
        AUTOMATON = FabricEntityTypeBuilder
            .create(SpawnGroup.CREATURE, AutomatonEntity::new)
            .dimensions(EntityDimensions.fixed(0.75f, 0.75f))
            .build();
    }

    public static void register() {
        Registry.register(Registry.ENTITY_TYPE, id("automaton"), AUTOMATON);

        FabricDefaultAttributeRegistry.register(AUTOMATON, AutomatonEntity.createMobAttributes());
    }
}
