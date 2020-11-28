package ru.falseresync.vivatech.common.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static ru.falseresync.vivatech.util.IdUtil.id;

public class VTWorldGen {
    public static final ConfiguredFeature<?, ?> COPPER_ORE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            VTBlocks.COPPER_ORE.getDefaultState(),
            6)) // vein size
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
            0, // bottom offset
            0, // min y level
            128))) // max y level
        .spreadHorizontally()
        .repeat(10); // number of veins per chunk

    public static final ConfiguredFeature<?, ?> ZINC_ORE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_NETHER,
            VTBlocks.ZINC_ORE.getDefaultState(),
            4)) // vein size
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
            0, // bottom offset
            0, // min y level
            128))) // max y level
        .spreadHorizontally()
        .repeat(10); // number of veins per chunk

    public static final ConfiguredFeature<?, ?> GALITE_ORE = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            VTBlocks.GALITE_ORE.getDefaultState(),
            9)) // vein size
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
            0, // bottom offset
            32, // min y level
            64))) // max y level
        .spreadHorizontally()
        .repeat(6); // number of veins per chunk

    public static void register() {
        RegistryKey<ConfiguredFeature<?, ?>> copperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, id("copper_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, copperOre.getValue(), COPPER_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copperOre);

        RegistryKey<ConfiguredFeature<?, ?>> zincOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, id("zinc_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, zincOre.getValue(), ZINC_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, zincOre);

        RegistryKey<ConfiguredFeature<?, ?>> galiteOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, id("galite_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, galiteOre.getValue(), GALITE_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, galiteOre);
    }
}
