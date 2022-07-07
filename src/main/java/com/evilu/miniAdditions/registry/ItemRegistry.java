package com.evilu.miniAdditions.registry;

import com.evilu.miniAdditions.MiniAdditionsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemRegistry {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiniAdditionsMod.MODID);

    public static final RegistryObject<Item> BLOSE_BUSH = ITEMS.register("blose_bush", () -> new DoubleHighBlockItem(BlockRegistry.BLOSE_BUSH.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> WHILAC = ITEMS.register("whilac", () -> new DoubleHighBlockItem(BlockRegistry.WHILAC.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));

    public static void registerItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}
