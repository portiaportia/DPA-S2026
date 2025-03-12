package factory;

import java.util.ArrayList;

public abstract class Cereal {
	protected String name;
	protected double price;
	protected ArrayList<String> toys;

	public Cereal(String name, double price) {
		this.name = name;
		this.price = price;
		toys = new ArrayList();
	}

	public String prepare() {
		return "Preparing the " + name;
	}

	public String boxCereal() {
		String toy = toys.get((int) Math.random() * toys.size());

		return "Boxing the " + name + "\n" +
				"    - Drawing fun pictures of " + name + " on the box\n" +
				"    - Pouring the " + name + " into the box\n" +
				"    - Adding the suprise " + toy + "\n";
	}

	public String priceCereal() {
		return "Putting the price tag of $" + price + " on the " + name + " box";
	}
}
