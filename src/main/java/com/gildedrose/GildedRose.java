package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrieItem(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    updateSulfurasItem(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackStageItem(item);
                    break;
                default:
                    updateNormalItem(item);
                    break;
            }
        }
    }

    public void updateBackStageItem(Item item) {
        increaseItemQualityBy1(item);
        if (item.sellIn < 11) {
            increaseItemQualityBy1(item);
        }
        if (item.sellIn < 6) {
            increaseItemQualityBy1(item);
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    public void updateAgedBrieItem(Item item) {
        item.sellIn = item.sellIn - 1;
        increaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            increaseItemQualityBy1(item);
        }
    }

    public void updateNormalItem(Item item) {
        item.sellIn = item.sellIn - 1;
        decreaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            decreaseItemQualityBy1(item);
        }
    }

    public void updateSulfurasItem(Item item) {
        //nothing to change
    }

    private void increaseItemQualityBy1(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseItemQualityBy1(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}