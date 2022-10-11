package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AgedBrieTest {
    private static final String ITEM_NAME = "Aged Brie";

    @Test
    @DisplayName("Test item AgedBrie in normal case")
    void testAgedBrieInNormalCase() {
        Item element = new Item(ITEM_NAME, 10, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, 9, 41"));
    }



    @Test
    @DisplayName("Test item AgedBrie in case quality = 50")
    void testAgedBrieQuality50() {
        Item element = new Item(ITEM_NAME, 10, 50);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, 9, 50"));
    }
    @Test
    @DisplayName("Test item AgedBrie in case sellIn < 0")
    void testAgedBrieSellInUnder0() {
        Item element = new Item(ITEM_NAME, -1, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, -2, 50"));
    }

    @Test
    @DisplayName("Test item AgedBrie in case sellIn < 0, quality 48")
    void testAgedBrieSellInUnder0Quality48() {
        Item element = new Item("Aged Brie", -1, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Aged Brie, -2, 50"));
    }

//    @Test
//    @DisplayName("Test that the name is unchanged")
//    void testName() {
//        Item element = new Item("foo", -1, 50);
//        GildedRose app = new GildedRose(new Item[] {element});
//        app.updateQuality();
//        assertThat(element.name, is("foo"));
//    }
}
