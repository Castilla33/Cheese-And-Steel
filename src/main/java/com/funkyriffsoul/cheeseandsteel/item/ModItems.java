package com.funkyriffsoul.cheeseandsteel.item;

import com.funkyriffsoul.cheeseandsteel.CheeseAndSteel;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheeseAndSteel.MOD_ID);


    // Every one missing crafting

    public static final RegistryObject<Item> CHEESE =  ITEMS.register("cheese",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)
                    .food(ModFoods.CHEESE)));

    public static final RegistryObject<Item> SANDWICH =  ITEMS.register("sandwich",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)
                    .food(ModFoods.SANDWICH)));

    public static final RegistryObject<Item> STEEL_ARROW =  ITEMS.register("steel_arrow",
            () -> new ArrowItem(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing extra damage property

    public static final RegistryObject<Item> STEEL_AXE =  ITEMS.register("steel_axe",
            () -> new AxeItem(ModItemTier.STEEL_INGOT, 0, -1f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_BOOTS =  ITEMS.register("steel_boots",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and armor properties

    public static final RegistryObject<Item> STEEL_CHESTPLATE =  ITEMS.register("steel_chestplate",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and armor properties

    public static final RegistryObject<Item> STEEL_HELMET =  ITEMS.register("steel_helmet",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and armor properties

    public static final RegistryObject<Item> STEEL_HOE =  ITEMS.register("steel_hoe",
            () -> new HoeItem(ModItemTier.STEEL_INGOT, 0, -1f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_INGOT =  ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_KNIFE =  ITEMS.register("steel_knife",
            () -> new SwordItem(ModItemTier.STEEL_INGOT, 0, 5f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_LEGGINGS =  ITEMS.register("steel_leggings",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and armor properties

    public static final RegistryObject<Item> STEEL_LID =  ITEMS.register("steel_lid",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_PICKAXE =  ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModItemTier.STEEL_INGOT, 0, -1f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_SHOVEL =  ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModItemTier.STEEL_INGOT, 0, -1f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_SWORD =  ITEMS.register("steel_sword",
            () -> new SwordItem(ModItemTier.STEEL_INGOT, 1, 2f, new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));

    public static final RegistryObject<Item> STEEL_TIP =  ITEMS.register("steel_tip",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
