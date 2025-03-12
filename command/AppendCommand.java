package command;

import java.util.Scanner;

public class AppendCommand extends Command {
	private Scanner in = new Scanner(System.in);

	public AppendCommand(Document document) {
		super(document);
	}

	@Override
	public String execute() {
		System.out.print("Enter Text: ");
		String data = in.nextLine().toLowerCase().trim();
		return document.append(data);
	}

}
