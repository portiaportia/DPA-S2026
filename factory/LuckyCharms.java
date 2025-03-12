package factory;

public class LuckyCharms extends Cereal {

	public LuckyCharms() {
		super("Lucky Charms", 1.55);
		toys.add("My Little Pony Stickers");
		toys.add("Elsa ring");
		toys.add("Play doe");
		toys.add("Tiny truck");
	}

	public String prepare() {
		String result = super.prepare() + "\n";
		result += "    - Gather the grain\n";
		result += "    - Shape into Xs and Os\n";
		result += "    - Create marshmallow shapes\n";
		result += "    - Mix grain and marshmallows\n";
		return result;
	}
}
