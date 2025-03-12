package factory;

public class FruitLoops extends Cereal {

	public FruitLoops() {
		super("Fruit Loops", 1.89);
		toys.add("Paw Patrol Stickers");
		toys.add("Bat Man ring");
		toys.add("Silly Putty");
		toys.add("Tiny Car");
	}

	public String prepare() {
		String result = super.prepare() + "\n";
		result += "    - Gather the grain\n";
		result += "    - Shape into circles\n";
		result += "    - Randomly color circles\n";
		result += "    - Let circles dry\n";
		return result;
	}
}
