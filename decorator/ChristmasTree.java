package decorator;

public class ChristmasTree extends Tree {

	public ChristmasTree() {
		super(FileReader.getLines("decorator/txt/tree.txt"));
	}
}
