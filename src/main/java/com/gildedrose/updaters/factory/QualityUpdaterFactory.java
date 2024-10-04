package com.gildedrose.updaters.factory;

import com.gildedrose.Item;
import com.gildedrose.updaters.AgedBrieQualityUpdater;
import com.gildedrose.updaters.BackStageQualityUpdater;
import com.gildedrose.updaters.ConjuredItemsQualityUpdater;
import com.gildedrose.updaters.NormalQualityUpdater;
import com.gildedrose.updaters.SulfurasQualityUpdater;

public class QualityUpdaterFactory {

  public static QualityUpdater getQualityUpdater(Item item) {
    switch (item.name) {
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackStageQualityUpdater();
      case "Aged Brie":
        return new AgedBrieQualityUpdater();
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasQualityUpdater();
      case "Conjured":
        return new ConjuredItemsQualityUpdater();
      default:
        return new NormalQualityUpdater();
    }
  }
}
