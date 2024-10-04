package com.gildedrose;

import com.gildedrose.updaters.factory.QualityStrategy;
import com.gildedrose.updaters.factory.QualityUpdaterFactory;

public class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      updateSingleItemQuality(item);
    }
  }

  private void updateSingleItemQuality(Item item) {
    QualityStrategy updater = QualityUpdaterFactory.getQualityUpdater(item);
    updater.updateQuality(item);
  }
}