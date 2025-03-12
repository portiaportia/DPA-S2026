package command;

import java.util.HashMap;

public class InputHandler {
	private HashMap<String, Command> commands;

	public InputHandler(Document document) {
		commands = new HashMap<String, Command>();
		commands.put("save", new SaveCommand(document));
		commands.put("view", new ViewCommand(document));
		commands.put("append", new AppendCommand(document));
		commands.put("write", new WriteCommand(document));
	}

	public void inputEntered(String data) {
		String input = data.toLowerCase().trim();

		if (commands.containsKey(input)) {
			System.out.println(commands.get(input).execute());
		} else {
			System.out.println("Sorry, we don't recognize that command");
		}
	}
}
