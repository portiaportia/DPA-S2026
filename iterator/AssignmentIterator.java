package iterator;

import java.util.Iterator;

public class AssignmentIterator implements Iterator<Assignment> {
	private Assignment[] assignments;
	private int position = 0;
	private Topic topic;

	public AssignmentIterator(Assignment[] assignments, Topic topic) {
		this.topic = topic;
		this.assignments = assignments;
	}

	public Assignment next() {
		if (!hasNext())
			return null;

		for(int i= position; i < assignments.length; i++){
			position++;
			if(assignments[i].hasTopic(topic)){
				return assignments[i];
			}
		}
	
		return null;
	}

	public boolean hasNext() {
		for(int i= position; i < assignments.length; i++){
			if(assignments[i] == null) {
				return false;
			}
			if(assignments[i].hasTopic(topic)){
				return true;
			}
		}

		return false;
	}
}
