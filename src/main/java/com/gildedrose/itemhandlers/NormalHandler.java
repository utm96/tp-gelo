package com.gildedrose.itemhandlers;

import com.gildedrose.Item;

public class NormalHandler implements ItemHandler {
    private Item item;
    private static final Integer MIN_QUALITY = 0;

    public NormalHandler(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        decreaseSellInBy1(item);
        decreaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            decreaseItemQualityBy1(item);
        }
    }
    public void decreaseSellInBy1(Item item) {
        item.sellIn -= 1;
    }
    private void decreaseItemQualityBy1(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality = item.quality - 1;
        }
    }
}
