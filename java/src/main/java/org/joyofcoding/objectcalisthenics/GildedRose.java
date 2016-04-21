package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
	public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
		gildedRose.updateQuality(gildedRose.makeItems());
	}

	public List<Item> makeItems() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
		return items;
	}

	public void updateQuality(List<Item> items) {
		for (Item item : items) {
            switch(item.getName()) {
                case "+5 Dexterity Vest" :
                    if (item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    break;
                case "Aged Brie" :
                    if (item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                    }
                    if (item.getSellIn() < 0 && item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                    }
                    break;
                case "Elixir of the Mongoose" :
                    if (item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros" :
                    item.setSellIn(item.getSellIn() - 1);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert" :
                    if (item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }
                    }
                    if (item.getSellIn() < 0) {
                        item.setQuality(item.getQuality() - item.getQuality());
                    }
                    break;
                case "Conjured Mana Cake" :
                    if (item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                    }
                    break;
            }
		}
	}

}
