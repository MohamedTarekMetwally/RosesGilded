package com.gildedrose.updaters.factory;

import com.gildedrose.Item;
import com.gildedrose.updaters.AgedBrieItemQualityUpdater;
import com.gildedrose.updaters.BackStageItemQualityUpdater;
import com.gildedrose.updaters.ConjuredItemQualityUpdater;
import com.gildedrose.updaters.NormalItemQualityUpdater;
import com.gildedrose.updaters.SulfurasItemQualityUpdater;

public class QualityUpdaterFactory {

  public static QualityUpdater getQualityUpdater(Item item) {
    switch (item.name) {
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackStageItemQualityUpdater();
      case "Aged Brie":
        return new AgedBrieItemQualityUpdater();
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasItemQualityUpdater();
      case "Conjured":
        return new ConjuredItemQualityUpdater();
      default:
        return new NormalItemQualityUpdater();
    }
  }
}
