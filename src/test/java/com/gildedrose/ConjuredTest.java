package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConjuredTest {
    private static final String ITEM_NAME = "Conjured Mana Cake";

    @Test
    @DisplayName("Test ConjuredITem in Conjured case")
    void testConjuredItemInConjuredCase() {
        Item element = new Item(ITEM_NAME, 2, 10);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, 1, 8"));
    }


    @Test
    @DisplayName("Test ConjuredITem in quality=5, sellin 0 case")
    void testConjuredItemInQuality0() {
        Item element = new Item(ITEM_NAME, 0, 5);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, -1, 1"));
    }
    @Test
    @DisplayName("Test ConjuredITem in sellIn = 0 , quality 3 case")
    void testConjuredItemSellIn0() {
        Item element = new Item(ITEM_NAME, 0, 3);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, -1, 0"));
    }
    @Test
    @DisplayName("Test ConjuredITem in sellIn = 0 case")
    void testConjuredItemSellIn0Quality1() {
        Item element = new Item(ITEM_NAME, 5, 1);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Conjured Mana Cake, 4, 0"));
    }
}
