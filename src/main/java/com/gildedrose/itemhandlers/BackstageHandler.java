package com.gildedrose.itemhandlers;

import com.gildedrose.Item;

public class BackstageHandler implements ItemHandler {
    private static final Integer MAX_QUALITY = 50;
    private Item item;



    public BackstageHandler(Item item) {
        this.item = item;
    }

    public void updateItem() {
        increaseItemQualityBy1(item);
        if (item.sellIn < 11) {
            increaseItemQualityBy1(item);
        }
        if (item.sellIn < 6) {
            increaseItemQualityBy1(item);
        }
        decreaseSellInBy1(item);
        if (item.sellIn < 0) {
            item.quality = 0;
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
