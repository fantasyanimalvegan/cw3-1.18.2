package net.fantasyanimalveg.cw3.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fantasyanimalveg.cw3.CW3;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SHIP_DEBRIS = registerItem("ship_debris", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(CW3.MOD_ID, name), item);

    }

    public static void registerModItems() {
        System.out.println("Registering mod items for " + CW3.MOD_ID);

    }
}
