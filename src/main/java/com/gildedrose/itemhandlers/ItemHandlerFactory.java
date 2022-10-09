package com.gildedrose.itemhandlers;

import com.gildedrose.Item;

public class ItemHandlerFactory {
    private static final String AGED_BRIE_ITEM = "Aged Brie";
    private static final String SULFURAS_ITEM = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_ITEM = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED_ITEM = "Conjured Mana Cake";

    public  static ItemHandler getHandler(Item item) {
        if (AGED_BRIE_ITEM.equals(item.name)) {
            return new AgedBrieHandler(item);
        }
        if (SULFURAS_ITEM.equals(item.name)) {
            return new SunfurasHandler(item);
        }
        if (BACKSTAGE_ITEM.equals(item.name)) {
            return new BackstageHandler(item);
        }
        if (CONJURED_ITEM.equals(item.name)) {
            return new ConjuredHandler(item);
        }
        return new NormalHandler(item);
    }
}
