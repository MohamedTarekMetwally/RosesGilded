package com.gildedrose.updaters.factory;

import com.gildedrose.Item;
import com.gildedrose.updaters.AgedBrieItemQualityUpdaterStrategy;
import com.gildedrose.updaters.BackStageItemQualityUpdaterStrategy;
import com.gildedrose.updaters.ConjuredItemQualityUpdaterStrategy;
import com.gildedrose.updaters.NormalItemQualityUpdaterStrategy;
import com.gildedrose.updaters.SulfurasItemQualityUpdaterStrategy;

public class QualityUpdaterFactory {

  public static QualityStrategy getQualityUpdater(Item item) {
    switch (item.name) {
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackStageItemQualityUpdaterStrategy();
      case "Aged Brie":
        return new AgedBrieItemQualityUpdaterStrategy();
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasItemQualityUpdaterStrategy();
      case "Conjured":
        return new ConjuredItemQualityUpdaterStrategy();
      default:
        return new NormalItemQualityUpdaterStrategy();
    }
  }
}
