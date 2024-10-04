package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.updaters.AgedBrieQualityUpdater;
import com.gildedrose.updaters.BackStageQualityUpdater;
import com.gildedrose.updaters.ConjuredItemsQualityUpdater;
import com.gildedrose.updaters.NormalQualityUpdater;
import com.gildedrose.updaters.SulfurasQualityUpdater;
import com.gildedrose.updaters.factory.QualityUpdater;
import com.gildedrose.updaters.factory.QualityUpdaterFactory;

public class GildedRoseTest {

    public GildedRose gildedRose;

    @Test
    public void testBackStageQualityUpdaterClass() {
        //GIVEN
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10);
        gildedRose = new GildedRose(new Item[]{item});
        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), BackStageQualityUpdater.class);
    }

    @Test
    public void testAgedBrieQualityUpdaterClass() {
        //GIVEN
        Item item = new Item("Aged Brie", 20, 10);
        gildedRose = new GildedRose(new Item[]{item});
        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), AgedBrieQualityUpdater.class);
    }

    @Test
    public void testSulfurasHandOfRagnarosQualityUpdaterClass() {
        //GIVEN
        Item item = new Item("Sulfuras, Hand of Ragnaros", 20, 10);
        gildedRose = new GildedRose(new Item[]{item});
        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), SulfurasQualityUpdater.class);
    }

    @Test
    public void testNormalQualityUpdaterClass() {
        //GIVEN
        Item item = new Item("Others", 20, 10);
        gildedRose = new GildedRose(new Item[]{item});
        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), NormalQualityUpdater.class);
    }

    @Test
    public void testConjuredQualityUpdaterClass() {
        //GIVEN
        Item item = new Item("Conjured", 20, 10);
        gildedRose = new GildedRose(new Item[]{item});
        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), ConjuredItemsQualityUpdater.class);
    }
}