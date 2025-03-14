package singleton;

import java.util.ArrayList;

public class ClothingItem {
    private String name;
    private String color;
    private ArrayList<Season> seasons = new ArrayList<Season>();

    public ClothingItem(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void addSeason(Season season) {
        this.seasons.add(season);
    }

    public boolean hasSeason(Season season) {
        for (Season seasonItem : seasons) {
            if (seasonItem.equals(season)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.color + " " + name;
    }
}
