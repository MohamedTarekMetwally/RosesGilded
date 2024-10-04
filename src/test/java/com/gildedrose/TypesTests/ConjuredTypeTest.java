package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class ConjuredTypeTest extends GildedRoseTest {

  @Test
  public void testConjuredItemQualityUpdated() {
    //GIVE
    Item item = new Item("Conjured", -5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 16);
    assertEquals(item.sellIn, -6);
  }

  @Test
  public void testConjuredItemQualityStays() {
    //GIVE
    Item item = new Item("Conjured", -5, -5);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, -5);
    assertEquals(item.sellIn, -6);
  }


  @Test
  public void testConjuredItemQualityChanges() {
    //GIVE
    Item item = new Item("Conjured", 5, 5);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 3);
    assertEquals(item.sellIn, 4);
  }
}