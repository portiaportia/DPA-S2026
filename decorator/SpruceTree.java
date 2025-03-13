package decorator;

public class SpruceTree extends Tree {

	public SpruceTree() {
		super(FileReader.getLines("decorator/txt/spruce-tree.txt"));
	}
}
