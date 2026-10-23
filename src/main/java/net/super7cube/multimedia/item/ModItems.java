package net.super7cube.multimedia.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.super7cube.multimedia.MultiMedia;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MultiMedia.MOD_ID);

    public static final DeferredItem<Item> VACUUM_TUBE = ITEMS.register("vacuum_tube",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
