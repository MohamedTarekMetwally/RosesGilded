package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class TestSulfurasTypeTest extends GildedRoseTest {

  @Test
  public void testSulfurasQualityUpdater() {
    //GIVEN
    Item item = new Item(SULFURAS_HAND_OF_RAGNAROS, 5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 20);
    assertEquals(item.sellIn, 5);
  }

  @Test
  public void testSulfurasNegativeQualityValue() {
    //GIVEN
    Item item = new Item(SULFURAS_HAND_OF_RAGNAROS, 5, -20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 0);
  }

  @Test
  public void testSulfurasQualityStaysEighty() {
    //GIVEN
    Item item1 = new Item(SULFURAS_HAND_OF_RAGNAROS, 5, 90);
    Item item2 = new Item(SULFURAS_HAND_OF_RAGNAROS, 5, 70);
    Item item3 = new Item(SULFURAS_HAND_OF_RAGNAROS, 5, 80);
    gildedRose = new GildedRose(new Item[]{item1,item2});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item1.quality, 80);
    assertEquals(item2.quality, 70);
    assertEquals(item3.quality, 80);
  }
}