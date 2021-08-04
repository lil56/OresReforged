package com.lily56.oresreforged.registry;

import com.lily56.oresreforged.OresReforged;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BAUXITE_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(OresReforged.MOD_ID, "bauxite_dust"), BAUXITE_DUST);
    }
}
