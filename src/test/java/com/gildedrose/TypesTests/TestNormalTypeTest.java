package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class TestNormalTypeTest extends GildedRoseTest {

  @Test
  public void testNormalQualityUpdater() {
    //GIVEN
    Item item = new Item("Other types", 5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 19);
    assertEquals(item.sellIn, 4);
  }

  @Test
  public void testNormalQualityNegativeSellIn() {
    //GIVEN
    Item item = new Item("Other types", -5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 18);
    assertEquals(item.sellIn, -6);
  }

  @Test
  public void testNormalQualityNegativeQualityValue() {
    //GIVEN
    Item item = new Item("Other types", -5, -20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, -20);
    assertEquals(item.sellIn, -6);
  }
}