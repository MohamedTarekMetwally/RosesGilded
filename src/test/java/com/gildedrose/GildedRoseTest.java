package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.updaters.AgedBrieItemQualityUpdaterStrategy;
import com.gildedrose.updaters.BackStageItemQualityUpdaterStrategy;
import com.gildedrose.updaters.ConjuredItemQualityUpdaterStrategy;
import com.gildedrose.updaters.NormalItemQualityUpdaterStrategy;
import com.gildedrose.updaters.SulfurasItemQualityUpdaterStrategy;
import com.gildedrose.updaters.QualityStrategy;
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
        QualityStrategy qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), BackStageItemQualityUpdaterStrategy.class);
    }

    @Test
    public void testAgedBrieQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(AGED_BRIE, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityStrategy qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), AgedBrieItemQualityUpdaterStrategy.class);
    }

    @Test
    public void testSulfurasHandOfRagnarosQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(SULFURAS_HAND_OF_RAGNAROS, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityStrategy qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), SulfurasItemQualityUpdaterStrategy.class);
    }

    @Test
    public void testNormalQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(OTHERS, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityStrategy qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), NormalItemQualityUpdaterStrategy.class);
    }

    @Test
    public void testConjuredQualityUpdaterClass() {
        //GIVEN
        Item item = new Item(CONJURED, 20, 10);
        gildedRose = new GildedRose(new Item[]{item});

        //WHEN
        QualityStrategy qualityUpdater = QualityUpdaterFactory.getQualityUpdater(item);

        //THEN
        assertEquals(qualityUpdater.getClass(), ConjuredItemQualityUpdaterStrategy.class);
    }
}