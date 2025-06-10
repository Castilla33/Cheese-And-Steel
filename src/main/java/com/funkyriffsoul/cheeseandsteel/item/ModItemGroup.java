package com.funkyriffsoul.cheeseandsteel.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CHEESEANDSTEEL_GROUP = new ItemGroup("cheeseAndSteelTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CHEESE.get());
        }
    };
}
