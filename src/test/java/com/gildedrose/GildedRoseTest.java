package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.updaters.AgedBrieItemQualityUpdater;
import com.gildedrose.updaters.BackStageItemQualityUpdater;
import com.gildedrose.updaters.ConjuredItemQualityUpdater;
import com.gildedrose.updaters.NormalItemQualityUpdater;
import com.gildedrose.updaters.SulfurasItemQualityUpdater;
import com.gildedrose.updaters.factory.QualityUpdater;
import com.gildedrose.updaters.factory.QualityUpdaterFactory;

public class GildedRoseTest {

    public final String BACK_STAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final String AGED_BRIE = "Aged Brie";
    public final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public final String CONJURED = "Conjured";
    public final String OTHERS = "Others";

    public GildedRose gildedRose;

    @Test
    public void testBackStageQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(BACK_STAGE, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), BackStageItemQualityUpdater.class);
    }

    @Test
    public void testAgedBrieQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(AGED_BRIE, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), AgedBrieItemQualityUpdater.class);
    }

    @Test
    public void testSulfurasHandOfRagnarosQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(SULFURAS_HAND_OF_RAGNAROS, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), SulfurasItemQualityUpdater.class);
    }

    @Test
    public void testNormalQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(OTHERS, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), NormalItemQualityUpdater.class);
    }

    @Test
    public void testConjuredQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(CONJURED, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityUpdater qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), ConjuredItemQualityUpdater.class);
    }
}