package decorator;

public class Star extends TreeDecorator {

	public Star(Tree tree) {
		super(tree.lines);
		integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
	}
}
