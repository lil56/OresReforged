package com.lily56.oresreforged;

import com.lily56.oresreforged.registry.ModBlocks;
import com.lily56.oresreforged.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class OresReforged implements ModInitializer {

    public static final String MOD_ID = "oresreforged";

    @Override

    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
