package com.funkyriffsoul.cheeseandsteel.item;

import com.funkyriffsoul.cheeseandsteel.CheeseAndSteel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheeseAndSteel.MOD_ID);


    // Every one missing crafting

    public static final RegistryObject<Item> CHEESE =  ITEMS.register("cheese",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing food property to cheese

    public static final RegistryObject<Item> SANDWICH =  ITEMS.register("sandwich",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing food property to sandwich

    public static final RegistryObject<Item> STEEL_ARROW =  ITEMS.register("steel_arrow",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing extra damage property

    public static final RegistryObject<Item> STEEL_AXE =  ITEMS.register("steel_axe",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing food durability and weapons properties

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
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and tool properties

    public static final RegistryObject<Item> STEEL_INGOT =  ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing melting

    public static final RegistryObject<Item> STEEL_KNIFE =  ITEMS.register("steel_knife",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and weapon properties

    public static final RegistryObject<Item> STEEL_LEGGINGS =  ITEMS.register("steel_leggings",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and armor properties

    public static final RegistryObject<Item> STEEL_LID =  ITEMS.register("steel_lid",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing food property to cheese

    public static final RegistryObject<Item> STEEL_PICKAXE =  ITEMS.register("steel_pickaxe",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and tool properties

    public static final RegistryObject<Item> STEEL_SHOVEL =  ITEMS.register("steel_shovel",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and tool properties

    public static final RegistryObject<Item> STEEL_SWORD =  ITEMS.register("steel_sword",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing durability and weapon properties

    public static final RegistryObject<Item> STEEL_TIP =  ITEMS.register("steel_tip",
            () -> new Item(new Item.Properties().group(ModItemGroup.CHEESEANDSTEEL_GROUP)));
    // Missing crafting



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
