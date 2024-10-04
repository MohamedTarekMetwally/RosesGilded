package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.updaters.factory.QualityUpdater;

public class BackStageQualityUpdater implements QualityUpdater {

  @Override
  public void updateQuality(Item item) {
    if(item.quality < 50) {
      item.quality += 1;
    }

    if(item.sellIn < 11 && item.quality < 50) {
      item.quality += 1;
    }

    if(item.sellIn < 6 && item.quality < 50) {
      item.quality += 1;
    }
    if(item.sellIn < 0) {
      item.quality = 0;
    }
    item.sellIn -=1;
  }
}
