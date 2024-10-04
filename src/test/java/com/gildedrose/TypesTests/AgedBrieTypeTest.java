package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class AgedBrieTypeTest extends GildedRoseTest {

  @Test
  public void testAgedBrieQualityUpdate() {
    //GIVE
    Item item = new Item(AGED_BRIE, 10, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 21);
    assertEquals(item.sellIn, 9);
  }

  @Test
  public void testAgedBrieNegativeQualityUpdate() {
    //GIVE
    Item item = new Item(AGED_BRIE, 10, -20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, -19);
    assertEquals(item.sellIn, 9);
  }

  @Test
  public void testAgedBrieUpdateBigQualityValue() {
    //GIVE
    Item item = new Item(AGED_BRIE, 10, 100);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 100);
    assertEquals(item.sellIn, 9);
  }

  @Test
  public void testAgedBrieSellInUpdateWhenNegative() {
    //GIVE
    Item item = new Item(AGED_BRIE, -5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.sellIn, -6);
    assertEquals(item.quality, 22);
  }
}