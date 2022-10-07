package com.gildedrose;

class GildedRose {
    Item[] items;
    private static final Integer MAX_QUALITY = 50;
    private static final Integer MIN_QUALITY = 0;

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
        decreaseSellInBy1(item);
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    public void updateAgedBrieItem(Item item) {
        decreaseSellInBy1(item);
        increaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            increaseItemQualityBy1(item);
        }
    }

    public void updateNormalItem(Item item) {
        decreaseSellInBy1(item);
        decreaseItemQualityBy1(item);
        if (item.sellIn < 0) {
            decreaseItemQualityBy1(item);
        }
    }

    public void updateSulfurasItem(Item item) {
        //nothing to change
    }

    public void decreaseSellInBy1(Item item) {
        item.sellIn -= 1;
    }

    private void increaseItemQualityBy1(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseItemQualityBy1(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality = item.quality - 1;
        }
    }

}