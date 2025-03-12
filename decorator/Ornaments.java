package decorator;

public class Ornaments extends TreeDecorator {

	public Ornaments(Tree tree) {
		super(tree.lines);
		integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
	}
}
