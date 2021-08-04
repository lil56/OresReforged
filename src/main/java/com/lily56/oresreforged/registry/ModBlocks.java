package com.lily56.oresreforged.registry;

import com.lily56.oresreforged.OresReforged;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BAUXITE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .hardness(3)
            .breakByHand(false)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0f,22.0f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(OresReforged.MOD_ID, "bauxite_ore"), BAUXITE_ORE);
    }
}
