package BinaryHeap;

import Person.Person;

public class BinNode {
	
	private Person element;
	private int priority;
	
	BinNode(Person element, int priority) {
		this.element = element;
		this.priority = priority;
	}
	
	public boolean isEmpty() {
		if (element == null)
			return true;
		else
			return false;
	}
	
	public Person getElement() {
		return element;
	}
	
	public int getPriority() {
		return priority;
	}
		
	@Override
	public String toString() {
		return "Data: " + element.getName() + " " + element.getSurname() + 
				". Age: " + element.getAge() + "." + " Priority: " + priority + ".";
	}	
}
