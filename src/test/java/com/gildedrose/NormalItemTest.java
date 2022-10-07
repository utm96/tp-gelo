package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class NormalItemTest {

    @Test
    @DisplayName("Test NormalITem in normal case")
    void testNormalItemInNormalCase() {
        Item element = new Item("foo", 10, 40);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("foo, 9, 39"));
    }




    @Test
    @DisplayName("Test NormalITem in quality=0 case")
    void testNormalItemInQuality0() {
        Item element = new Item("foo", 10, 0);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("foo, 9, 0"));
    }
    @Test
    @DisplayName("Test NormalITem in sellIn = 0 case")
    void testNormalItemSellIn0() {
        Item element = new Item("foo", 0, 2);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("foo, -1, 0"));
    }
    @Test
    @DisplayName("Test NormalITem in sellIn = 0 case")
    void testNormalItemSellIn0Quality1() {
        Item element = new Item("foo", 0, 1);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("foo, -1, 0"));
    }
    @Test
    @DisplayName("Test NormalITem in sellIn = 1 case")
    void testNormalItemSellIn1() {
        Item element = new Item("foo", 1, 50);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.toString(), is("foo, 0, 49"));
    }
}
