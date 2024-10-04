package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRose22;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class TestSulfurasTypeTest extends GildedRoseTest {

  @Test
  public void testSulfurasQualityUpdater() {
    //GIVEN
    Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 20);
    assertEquals(item.sellIn, 5);
  }
}