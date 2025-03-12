package singleton;

import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
	private static OutfitCreator outfitCreator;
	private ArrayList<ClothingItem> tops;
	private ArrayList<ClothingItem> bottoms;
	private ArrayList<ClothingItem> wholes;
	private Random rand;

	private OutfitCreator() {
		tops = FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
		bottoms = FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
		wholes = FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
		rand = new Random();
	}

	public static OutfitCreator getInstance() {
		if (outfitCreator == null) {
			outfitCreator = new OutfitCreator();
		}
		return outfitCreator;
	}

	private ClothingItem getRandClothingItem(ArrayList<ClothingItem> items, Season season) {
		ArrayList<ClothingItem> seasonClothing = new ArrayList<ClothingItem>();

		for (ClothingItem item : items) {
			if (item.hasSeason(season)) {
				seasonClothing.add(item);
			}
		}

		int index = rand.nextInt(seasonClothing.size());
		return seasonClothing.get(index);
	}

	public String getOutfit(Season season) {
		if (rand.nextInt(2) == 0) {
			return "A " + getRandClothingItem(tops, season).toString() + " and a "
					+ getRandClothingItem(bottoms, season).toString();
		} else {
			return "A " + getRandClothingItem(wholes, season).toString();
		}
	}

}
