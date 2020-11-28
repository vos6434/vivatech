package ru.falseresync.vivatech.common.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import ru.falseresync.vivatech.common.Vivatech;
import ru.falseresync.vivatech.common.item.HammerItem;
import ru.falseresync.vivatech.common.item.SacrificialDaggerItem;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTItems {
    public static final Item COPPER_ORE;
    public static final Item ZINC_ORE;
    public static final Item GALITE_ORE;

    public static final Item COPPER_BLOCK;
    public static final Item ZINC_BLOCK;
    public static final Item BRASS_BLOCK;

    public static final Item CRYSTALLINE_HEART;

    public static final Item COPPER_INGOT;
    public static final Item ZINC_INGOT;
    public static final Item BRASS_INGOT;
    public static final Item GALITE_PARCEL;
    public static final Item GORE;
    public static final Item CRYSTALLINE_HEART_SHARD;

    public static final Item SACRIFICIAL_DAGGER;
    public static final Item HAMMER;

    public static final Item LIFE_ENGINE;
    public static final Item WARRIOR_CORE;
    public static final Item HARVESTER_CORE;
    public static final Item PORTER_CORE;
    public static final Item DIGGER_CORE;

    public static final Item ALLOYER;

    static {

        COPPER_ORE = new BlockItem(VTBlocks.COPPER_ORE, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        ZINC_ORE = new BlockItem(VTBlocks.ZINC_ORE, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        GALITE_ORE = new BlockItem(VTBlocks.GALITE_ORE, new FabricItemSettings().group(Vivatech.ITEM_GROUP));

        COPPER_BLOCK = new BlockItem(VTBlocks.COPPER_BLOCK, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        ZINC_BLOCK = new BlockItem(VTBlocks.ZINC_BLOCK, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        BRASS_BLOCK = new BlockItem(VTBlocks.BRASS_BLOCK, new FabricItemSettings().group(Vivatech.ITEM_GROUP));

        CRYSTALLINE_HEART = new BlockItem(VTBlocks.CRYSTALLINE_HEART, new FabricItemSettings().group(Vivatech.ITEM_GROUP));

        COPPER_INGOT = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        ZINC_INGOT = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        BRASS_INGOT = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        GALITE_PARCEL = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        GORE = new Item(new FabricItemSettings().food(FoodComponents.POISONOUS_POTATO).group(Vivatech.ITEM_GROUP));
        CRYSTALLINE_HEART_SHARD = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));

        SACRIFICIAL_DAGGER = new SacrificialDaggerItem();
        HAMMER = new HammerItem();

        LIFE_ENGINE = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        WARRIOR_CORE = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        HARVESTER_CORE = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        PORTER_CORE = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));
        DIGGER_CORE = new Item(new FabricItemSettings().group(Vivatech.ITEM_GROUP));

        ALLOYER = new BlockItem(VTBlocks.ALLOYER, new FabricItemSettings().group(Vivatech.ITEM_GROUP));
    }

    public static void register() {
        Registry.register(Registry.ITEM, id("copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, id("zinc_ore"), ZINC_ORE);
        Registry.register(Registry.ITEM, id("galite_ore"), GALITE_ORE);

        Registry.register(Registry.ITEM, id("copper_block"), COPPER_BLOCK);
        Registry.register(Registry.ITEM, id("zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.ITEM, id("brass_block"), BRASS_BLOCK);

        Registry.register(Registry.ITEM, id("copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, id("zinc_ingot"), ZINC_INGOT);
        Registry.register(Registry.ITEM, id("brass_ingot"), BRASS_INGOT);
        Registry.register(Registry.ITEM, id("galite_parcel"), GALITE_PARCEL);
        Registry.register(Registry.ITEM, id("gore"), GORE);
        Registry.register(Registry.ITEM, id("crystalline_heart"), CRYSTALLINE_HEART);
        Registry.register(Registry.ITEM, id("crystalline_heart_shard"), CRYSTALLINE_HEART_SHARD);

        Registry.register(Registry.ITEM, id("sacrificial_dagger"), SACRIFICIAL_DAGGER);
        Registry.register(Registry.ITEM, id("hammer"), HAMMER);

        Registry.register(Registry.ITEM, id("life_engine"), LIFE_ENGINE);
        Registry.register(Registry.ITEM, id("warrior_core"), WARRIOR_CORE);
        Registry.register(Registry.ITEM, id("harvester_core"), HARVESTER_CORE);
        Registry.register(Registry.ITEM, id("porter_core"), PORTER_CORE);
        Registry.register(Registry.ITEM, id("digger_core"), DIGGER_CORE);

        Registry.register(Registry.ITEM, id("alloyer"), ALLOYER);
    }
}
