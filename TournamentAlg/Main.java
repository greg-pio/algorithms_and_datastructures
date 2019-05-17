package TournamentAlg;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = {3, 2, 1, 6, -9};
		
		Tournament searcher = new Tournament();
		
		System.out.println("Minimum w tej tablicy to: " 
		+ searcher.findMin(tab, 0, tab.length-1));
		
	}
}
