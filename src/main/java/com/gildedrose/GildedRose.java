package com.gildedrose;

import com.gildedrose.itemhandlers.ItemHandler;
import com.gildedrose.itemhandlers.ItemHandlerFactory;

class GildedRose {
    Item[] items;
    private static final Integer MAX_QUALITY = 50;
    private static final Integer MIN_QUALITY = 0;

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