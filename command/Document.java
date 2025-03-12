package command;

import java.util.ArrayList;

public class Document {
	private static final int PADDING = 5;
	private String fileName;
	private ArrayList<String> lines;

	public Document(String fileName) {
		this.fileName = "command/text/" + fileName;
		lines = FileManipulator.readFile(this.fileName);
	}

	public String view() {
		int lineLength = getLineLength();
		String border = getRowBorder(lineLength);
		String padding = getPadding(PADDING);

		String result = border + "\n";

		for (String line : lines) {
			String extraPadding = getPadding(lineLength - line.length());
			result += "|" + padding + line + extraPadding + padding + "|\n";
		}

		return result += border + "\n";
	}

	private String getPadding(int num) {
		String padding = "";

		for (int i = 0; i < num; i++) {
			padding += " ";
		}

		return padding;
	}

	private String getRowBorder(int lineLength) {
		String border = "";
		for (int i = 0; i <= lineLength + PADDING * 2; i++) {
			border += "_";
		}
		return border + "\n";
	}

	private int getLineLength() {
		int length = 0;

		for (String line : lines) {
			if (line.length() > length) {
				length = line.length();
			}
		}

		return length;
	}

	public String append(String line) {
		lines.add(line);
		return "The line has been appended to the document.\n";
	}

	public String write(String line) {
		lines = new ArrayList<String>();
		lines.add(line);
		return "The line was written to the file\n";
	}

	public String save() {
		if (FileManipulator.writeFile(fileName, lines)) {
			return "The file has been saved.";
		} else {
			return "Sorry, we cannot save at this time.";
		}
	}
}
