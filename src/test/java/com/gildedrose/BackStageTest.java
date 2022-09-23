package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BackStageTest {

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in normal case")
    void testBackStageInNormalCase() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 14, 41"));
    }


    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in quality=50")
    void testBackStageInQuality50() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 14, 50"));
    }


    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=9")
    void testBackStageInSellIn9() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 8, 50"));
    }
    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=9, quality=49")
    void testBackStageInSellIn9Quality49() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 8, 50"));
    }

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=2")
    void testBackStageInSellIn2() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 47);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 1, 50"));
    }

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=2, quality=48")
    void testBackStageInSellIn2Quality48() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 1, 50"));
    }

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=0")
    void testBackStageInSellIn0() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, -1, 0"));
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
