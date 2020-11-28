package ru.falseresync.vivatech.common.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import ru.falseresync.vivatech.common.block.entity.AlloyerBlockEntity;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTBlockEntities {
    public static final BlockEntityType<AlloyerBlockEntity> ALLOYER;

    static {
        ALLOYER = BlockEntityType.Builder.create(AlloyerBlockEntity::new, VTBlocks.ALLOYER).build(null);
    }

    public static void register() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, id("alloyer"), ALLOYER);
    }
}
