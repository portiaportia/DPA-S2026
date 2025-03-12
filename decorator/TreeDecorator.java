package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
	public TreeDecorator(ArrayList<String> lines) {
		super(lines);
	}

	protected void integrateDecor(ArrayList<String> decor) {
		for (int i = 0; i < decor.size(); i++) {
			String line = "";
			for (int j = 0; j < decor.get(i).length(); j++) {
				if (decor.get(i).charAt(j) != ' ') {
					line += decor.get(i).charAt(j);
				} else if (lines.get(i).length() > j) {
					line += lines.get(i).charAt(j);
				}
			}
			lines.set(i, line);
		}
	}
}
