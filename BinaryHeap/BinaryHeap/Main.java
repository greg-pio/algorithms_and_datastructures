package BinaryHeap;

import Person.Person;

public class Main {

	public static void main(String[] args) {
		
		Person mary = new Person("Mary", "Green", 20);
		Person mark = new Person("Mark", "Yellow", 60);
		Person john = new Person("John", "Dark", 12);
		Person adam = new Person("Adam", "Bright", 30);
		Person martha = new Person("Martha", "King", 33);
		Person greg = new Person("Greg", "Pawn", 1);
		
		BinHeap heap = new BinHeap(mary, 2);
		heap.showTree();
		System.out.println();
		
		heap.insert(mark, 4);
		heap.insert(john, 12);
		
		heap.showTree();
		System.out.println();
		
		heap.insert(adam, 1);
		heap.showTree();
		System.out.println();
		
		System.out.println("root: " + heap.findMin().toString());
		System.out.println();
		
		heap.insert(martha, 5);
		heap.insert(greg, 15);
		
		heap.showTree();
		System.out.println();
		
		heap.delMin();
		heap.showTree();

	}
}
