package ru.falseresync.vivatech.common.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import ru.falseresync.vivatech.common.Vivatech;

public class SacrificialDaggerItem extends SwordItem {
    public SacrificialDaggerItem() {
        super(ToolMaterials.IRON, 2, -3.0F, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
    }
}
