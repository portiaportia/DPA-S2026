package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class OutfitCreator {
	private static OutfitCreator outfitCreator;
	private HashMap<ClothingPart, ArrayList<ClothingItem>> clothing = new HashMap<>();
	private Random rand;

	private OutfitCreator() {
		clothing.put(ClothingPart.TOP, FileReader.getTops());
		clothing.put(ClothingPart.BOTTOM, FileReader.getBottoms());
		clothing.put(ClothingPart.WHOLE, FileReader.getwholes());
		rand = new Random();
	}

	public static OutfitCreator getInstance() {
		if (outfitCreator == null) {
			outfitCreator = new OutfitCreator();
		}
		return outfitCreator;
	}

	private ClothingItem getRandClothingItem(ClothingPart part, Season season) {
		ArrayList<ClothingItem> clothingList = new ArrayList<>();

		for (ClothingItem item : clothing.get(part)) {
			if (item.hasSeason(season)) {
				clothingList.add(item);
			}
		}

		int index = rand.nextInt(clothingList.size());
		return clothingList.get(index);
	}

	public String getOutfit(Season season) {
		if (rand.nextInt(2) == 0) {
			return "A " + getRandClothingItem(ClothingPart.TOP, season).toString() + " and a "
					+ getRandClothingItem(ClothingPart.BOTTOM, season).toString();
		} else {
			return "A " + getRandClothingItem(ClothingPart.WHOLE, season).toString();
		}
	}

}
