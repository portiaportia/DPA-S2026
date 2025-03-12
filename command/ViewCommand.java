package command;

public class ViewCommand extends Command {

	public ViewCommand(Document document) {
		super(document);
	}

	@Override
	public String execute() {
		return document.view();
	}

}
