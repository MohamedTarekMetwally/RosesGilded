package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.factory.QualityStrategy;

public class AgedBrieItemQualityUpdaterStrategy implements QualityStrategy {

  @Override
  public void updateQuality(Item item) {
    if(item.quality < 50) {
      item.quality += 1;
    }
    item.sellIn -= 1;
    if(item.sellIn < 0 && item.quality < 50) {
      item.quality += 1;
    }
  }
}