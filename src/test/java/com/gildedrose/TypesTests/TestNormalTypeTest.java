package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class TestNormalTypeTest extends GildedRoseTest {

  @Test
  public void testNormalQualityUpdater() {
    //GIVEN
    Item item = new Item(OTHERS, 5, 20);
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
    Item item = new Item(OTHERS, -5, 20);
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
    Item item = new Item(OTHERS, -5, -20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 0);
    assertEquals(item.sellIn, -6);
  }

  @Test
  public void testNormalQualityBigQualityValue() {
    //GIVEN
    Item item = new Item(OTHERS, -5, 80);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 50);
    assertEquals(item.sellIn, -6);
  }
}