package ru.falseresync.vivatech.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import ru.falseresync.vivatech.common.block.AlloyerBlock;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTBlocks {
    public static final Block COPPER_ORE;
    public static final Block ZINC_ORE;
    public static final Block GALITE_ORE;

    public static final Block COPPER_BLOCK;
    public static final Block ZINC_BLOCK;
    public static final Block BRASS_BLOCK;

    public static final Block CRYSTALLINE_HEART;

    public static final Block ALLOYER;

    static {
        COPPER_ORE = new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE));
        ZINC_ORE = new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE));
        GALITE_ORE = new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE));

        COPPER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
        ZINC_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
        BRASS_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));

        CRYSTALLINE_HEART = new Block(FabricBlockSettings.copyOf(Blocks.GLASS));

        ALLOYER = new AlloyerBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    }

    public static void register() {
        Registry.register(Registry.BLOCK, id("copper_ore"), COPPER_ORE);
        Registry.register(Registry.BLOCK, id("zinc_ore"), ZINC_ORE);
        Registry.register(Registry.BLOCK, id("galite_ore"), GALITE_ORE);

        Registry.register(Registry.BLOCK, id("copper_block"), COPPER_BLOCK);
        Registry.register(Registry.BLOCK, id("zinc_block"), ZINC_BLOCK);
        Registry.register(Registry.BLOCK, id("brass_block"), BRASS_BLOCK);

        Registry.register(Registry.BLOCK, id("crystalline_heart"), CRYSTALLINE_HEART);

        Registry.register(Registry.BLOCK, id("alloyer"), ALLOYER);
    }
}
