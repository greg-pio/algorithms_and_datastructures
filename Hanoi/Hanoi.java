package Hanoi;

public class Hanoi {
	
	public int counter;
	
	public Hanoi() {
		this.counter = 0;
	}
	
	public void solve(int disks, char start_p, char mid_p, char end_p) {
		if (disks < 1) {
			System.out.println("Cannot solve for number of disks less than 1");
			return;
		}
		if (disks == 1) {
			System.out.println("Disk " + disks + " from " + start_p + " to " + end_p);
			counter++;
		} else {
			solve(disks - 1, start_p, end_p, mid_p);
		    System.out.println("Disk " + disks + " from " + start_p + " to " + end_p);
		    counter++;
		    solve(disks - 1, mid_p, start_p, end_p);
		}
	}
}
