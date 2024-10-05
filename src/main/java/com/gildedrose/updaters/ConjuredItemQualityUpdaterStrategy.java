package com.gildedrose.updaters;

import com.gildedrose.Item;

public class ConjuredItemQualityUpdaterStrategy implements QualityStrategy {

  @Override
  public void updateQuality(Item item) {

    if(item.quality > 0) {
      item.quality -= 2;
    }

    item.sellIn -= 1;

    if(item.sellIn < 0 && item.quality > 0) {
      item.quality -= 2;
    }

    //Handling quality of item to never be negative
    if(item.quality < 0) {
      item.quality = 0;
      throw new IllegalStateException("\u001B[31m" + "Quality can't be negative for "
          + "the item with name: " + item.name);
    }
    //Handling quality of item can not be more than fifty
    else if(item.quality > 50) {
      item.quality = 50;
      throw new IllegalStateException("\u001B[31m" + "Quality can't be more than fifty for "
          + "the item with name: " + item.name);
    }
  }
}