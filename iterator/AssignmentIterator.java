package iterator;

import java.util.Iterator;

public class AssignmentIterator implements Iterator<Assignment> {
	private Assignment[] assignments;
	private int position = 0;

	public AssignmentIterator(Assignment[] assignments) {
		this.assignments = assignments;
	}

	public Assignment next() {
		if (!hasNext())
			return null;
		Assignment assignment = assignments[position];
		position = position + 1;
		return assignment;
	}

	public boolean hasNext() {
		return position < assignments.length && assignments[position] != null;
	}
}
