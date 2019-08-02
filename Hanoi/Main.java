package Hanoi;

public class Main {

	public static void main(String[] args) {
		
		Hanoi tower = new Hanoi();
		tower.solve(3, 'S', 'M', 'E');
		System.out.println("Number of moves " + tower.counter);
		

	}
}
