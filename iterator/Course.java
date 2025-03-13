package iterator;

public class Course {
	private Assignment[] assignments = new Assignment[5];
	private int count = 0;
	private String name;
	private String title;

	public Course(String name, String title) {
		this.name = name;
		this.title = title;
	}

	public void addAssignment(String title, String description, Topic topic) {
		if (count == assignments.length) {
			assignments = growArray(assignments);
		}

		assignments[count] = new Assignment(title, description, topic);
		count++;
	}

	public AssignmentIterator createIterator(Topic topic) {
		return new AssignmentIterator(assignments, topic);
	}

	public String toString() {
		return this.name + ": " + this.title;
	}

	private Assignment[] growArray(Assignment[] first) {
		Assignment[] second = new Assignment[first.length * 2];

		for (int i = 0; i < first.length; i++) {
			second[i] = first[i];
		}

		return second;
	}

}
