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
    void testBackStageInSellIn10() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 9, 50"));
    }
    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=9, quality=49")
    void testBackStageInSellIn10Quality49() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 9, 50"));
    }
    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=11, quality=48")
    void testBackStageInSellIn11Quality48() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 10, 49"));
    }

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=2")
    void testBackStageInSellIn5() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 4, 50"));
    }
    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=2")
    void testBackStageInSellIn6() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 47);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 5, 49"));
    }

    @Test
    @DisplayName("Test item Backstage passes to a TAFKAL80ETC concert in sellIn=2, quality=48")
    void testBackStageInSellIn5Quality48() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("Backstage passes to a TAFKAL80ETC concert, 4, 50"));
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
