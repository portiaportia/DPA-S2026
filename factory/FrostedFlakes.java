package factory;

public class FrostedFlakes extends Cereal {

	public FrostedFlakes() {
		super("Frosted Flakes", 2.99);
		toys.add("Spider Man Tattoo");
		toys.add("Barbie Tattoo");
		toys.add("Snap Bracelet");
		toys.add("Happy Feet Figurine");
	}

	public String prepare() {
		String result = super.prepare() + "\n";
		result += "    - Gather the grain\n";
		result += "    - Shape into flakes\n";
		result += "    - Sprinkle with frosting\n";
		return result;
	}
}
