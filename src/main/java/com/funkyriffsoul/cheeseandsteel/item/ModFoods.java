package com.funkyriffsoul.cheeseandsteel.item;

import net.minecraft.item.Food;

public class ModFoods {
    public static final Food CHEESE = (new Food.Builder())
            .hunger(3)
            .saturation(0.4F)
            .build();

    public static final Food SANDWICH = (new Food.Builder())
            .hunger(12)
            .saturation(0.8F)
            .build();

}
