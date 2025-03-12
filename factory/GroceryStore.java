package factory;

public class GroceryStore {

	public Cereal createCereal(String type) {
		if (type.equalsIgnoreCase("frosted flakes")) {
			return new FrostedFlakes();
		} else if (type.equalsIgnoreCase("lucky charms")) {
			return new LuckyCharms();
		} else if (type.equalsIgnoreCase("fruit loops")) {
			return new FruitLoops();
		}

		return null;
	}

}
