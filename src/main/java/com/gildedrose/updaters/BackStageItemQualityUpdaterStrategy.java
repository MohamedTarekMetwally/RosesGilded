package com.gildedrose.updaters;

import com.gildedrose.Item;

public class BackStageItemQualityUpdaterStrategy implements QualityStrategy {

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

    item.sellIn -=1;

    /**
     * Handled if the item is expired or the quality is negative
     * quality will be updated to zero again
     **/
    if(item.sellIn < 0 || item.quality < 0) {
      item.quality = 0;
      throw new IllegalStateException("\u001B[31m" + "Quality can't be negative for "
          + "the item with name: " + item.name);
    }

    //Handling quality of item can not be more than fifty
    if(item.quality > 50) {
      item.quality = 50;
      throw new IllegalStateException("\u001B[31m" + "Quality can't be more than fifty for "
          + "the item with name: " + item.name);
    }
  }
}