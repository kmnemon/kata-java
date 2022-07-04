package k02_gildedrose.refactory;

import k02_gildedrose.course.Item;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        degradeSellIns();
        updateQualities();
    }

    private void updateQualities() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];

            if (isNormalGoods(item)) {
                updateNormalGoodsQuality(item);
            } else {
                updateSpecialGoodsQuality(item);
            }
        }
    }

    void updateNormalGoodsQuality(Item item) {
        degradeQuality(item);

        if (item.sellIn < 0) {
            degradeQuality(item);
        }
    }

    private void updateSpecialGoodsQuality(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateBackstageQuality(item);
        }

        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            //do nothing
        }

        if(item.name.equals("Aged Brie")){
            updateAgedBrieQuality(item);
        }

        if(item.name.equals("Conjured Mana Cake")){
            updateConjuredQuality(item);
        }
    }

    private void updateBackstageQuality(Item item) {
        increaseQuality(item);

        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }

        if (item.sellIn < 0) {
            qualityClean(item);
        }
    }

    private void updateAgedBrieQuality(Item item){
        increaseQuality(item);

        if (item.sellIn < 0) {
            increaseQuality(item);
        }

    }

    private void updateConjuredQuality(Item item){
        degradeQuality(item);
        degradeQuality(item);

        if (item.sellIn < 0) {
            degradeQuality(item);
            degradeQuality(item);
        }
    }

    private boolean isNormalGoods(Item item) {
        return !item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")
                && !item.name.equals("Sulfuras, Hand of Ragnaros")
                && !item.name.equals("Conjured Mana Cake");
    }

    private void degradeSellIns() {
        for (int i = 0; i < items.length; i++) {
            degradeSellIn(i);
        }
    }



    private void degradeSellIn(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void degradeQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void qualityClean(Item item) {
        item.quality = 0;
    }
}
