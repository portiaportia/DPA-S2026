package iterator;

public class Assignment {
	private String title;
	private String description;
	private Topic topic;

	public Assignment(String title, String description, Topic topic) {
		this.title = title;
		this.description = description;
		this.topic = topic;
	}

	public boolean hasTopic(Topic topic) {
		return this.topic == topic || topic == Topic.ALL;
	}

	public String toString() {
		return title + ": " + description;
	}
}
