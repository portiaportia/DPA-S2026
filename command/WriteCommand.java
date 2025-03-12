package command;

import java.util.Scanner;

public class WriteCommand extends Command {
	private Scanner in = new Scanner(System.in);

	public WriteCommand(Document document) {
		super(document);
	}

	@Override
	public String execute() {
		System.out.print("Enter Text: ");
		String data = in.nextLine().toLowerCase().trim();
		return document.write(data);
	}

}
