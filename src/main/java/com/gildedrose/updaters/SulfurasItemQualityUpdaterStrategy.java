package com.gildedrose.updaters;

import com.gildedrose.Item;

public class SulfurasItemQualityUpdaterStrategy implements QualityStrategy {

  @Override
  public void updateQuality(Item item) {

    if(item.quality > 80) {
      item.quality = 80;
    }

    if(item.quality < 0) {
      item.quality = 0;
      throw new IllegalStateException("\u001B[31m" + "Quality can't be negative for "
          + "the item with name: " + item.name);
    }
  }
}