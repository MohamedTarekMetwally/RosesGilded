package com.gildedrose.TypesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.GildedRoseTest;
import com.gildedrose.Item;

public class BackStageTypeTest extends GildedRoseTest {

  @Test
  public void testBackStageQualityUpdater() {
    //GIVEN
    Item item = new Item(BACK_STAGE, 5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    gildedRose.updateQuality();

    //THEN
    assertEquals(item.quality, 23);
    assertEquals(item.sellIn, 4);
  }

  @Test
  public void testBackStageNegativeSellIn() {
    //GIVEN
    Item item = new Item(BACK_STAGE, -5, 20);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 0);
    assertEquals(item.sellIn, -6);
  }

  @Test
  public void testBackStageBigQualityValue() {
    //GIVEN
    Item item = new Item(BACK_STAGE, 5, 100);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 50);
    assertEquals(item.sellIn, 4);
  }

  @Test
  public void testBackStageNegativeQualityValue() {
    //GIVEN
    Item item = new Item(BACK_STAGE, 5, -5);
    gildedRose = new GildedRose(new Item[]{item});

    //WHEN
    assertThrows(IllegalStateException.class, () -> gildedRose.updateQuality());

    //THEN
    assertEquals(item.quality, 0);
    assertEquals(item.sellIn, 4);
  }
}