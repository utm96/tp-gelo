package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SulfurasTest {

    @Test
    @DisplayName("Test item Sulfuras in normal case")
    void testSulfurasInNormalCase() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", 10, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Sulfuras, Hand of Ragnaros, 10, 40"));
    }
    @Test
    @DisplayName("Test item Sulfuras in case sellIn < 0")
    void testSulfurasSellInUnder0() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Sulfuras, Hand of Ragnaros, -1, 40"));
    }



//    @Test
//    @DisplayName("Test item AgedBrie in case quality = 50")
//    void testAgedBrieQuality50() {
//        Item element = new Item("Aged Brie", 10, 50);
//        GildedRose app = new GildedRose(new Item[] {element});
//        app.updateQuality();
//        assertThat(element.toString(), is("Aged Brie, 9, 50"));
//    }


//    @Test
//    @DisplayName("Test that the name is unchanged")
//    void testName() {
//        Item element = new Item("foo", -1, 50);
//        GildedRose app = new GildedRose(new Item[] {element});
//        app.updateQuality();
//        assertThat(element.name, is("foo"));
//    }
}
