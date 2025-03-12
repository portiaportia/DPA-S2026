package command;

public class SaveCommand extends Command {

	public SaveCommand(Document document) {
		super(document);
	}

	@Override
	public String execute() {
		return document.save();
	}

}
