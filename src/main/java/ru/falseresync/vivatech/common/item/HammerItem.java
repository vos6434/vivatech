package ru.falseresync.vivatech.common.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import ru.falseresync.vivatech.common.Vivatech;

public class HammerItem extends PickaxeItem {
    public HammerItem() {
        super(ToolMaterials.IRON, 3, -3.4F, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
    }
}
