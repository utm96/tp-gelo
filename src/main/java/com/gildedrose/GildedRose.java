package com.gildedrose;

import com.gildedrose.itemhandlers.ItemHandler;
import com.gildedrose.itemhandlers.ItemHandlerFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemHandler itemHandler = ItemHandlerFactory.getHandler(item);
            itemHandler.updateItem();
        }
    }

}