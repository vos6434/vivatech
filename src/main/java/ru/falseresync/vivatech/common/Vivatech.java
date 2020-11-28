package ru.falseresync.vivatech.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ru.falseresync.vivatech.common.registry.*;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class Vivatech implements ModInitializer {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(id("vivatech"), () -> new ItemStack(VTItems.CRYSTALLINE_HEART));

    @Override
    public void onInitialize() {
        VTBlocks.register();
        VTBlockEntities.register();
        VTItems.register();
        VTWorldGen.register();
        VTEntities.register();
        VTScreenHandlers.register();
    }
}
