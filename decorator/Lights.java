package decorator;

public class Lights extends TreeDecorator {

	public Lights(Tree tree) {
		super(tree.lines);
		integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
	}
}
