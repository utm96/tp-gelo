package com.gildedrose.itemhandlers;

import com.gildedrose.Item;

public class AgedBrieHandler implements ItemHandler {
    private static final Integer MAX_QUALITY = 50;
    private Item item;



    public AgedBrieHandler(Item item) {
        this.item = item;
    }

    public void updateItem() {
        decreaseSellInBy1(item);
        increaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            increaseItemQualityBy1(item);
        }
    }

    public void decreaseSellInBy1(Item item) {
        item.sellIn -= 1;
    }

    private void increaseItemQualityBy1(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality = item.quality + 1;
        }
    }
}
