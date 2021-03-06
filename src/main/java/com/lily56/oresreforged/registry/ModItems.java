package com.lily56.oresreforged.registry;

import com.lily56.oresreforged.OresReforged;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items

    public static final Item BAUXITE_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Block Items
    public static final BlockItem BAUXITE_ORE = new BlockItem(ModBlocks.BAUXITE_ORE, new item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Register
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(OresReforged.MOD_ID, "bauxite_dust"), BAUXITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(OresReforged.MOD_ID, "bauxite_ore"), BAUXITE_ORE);
    }
}
