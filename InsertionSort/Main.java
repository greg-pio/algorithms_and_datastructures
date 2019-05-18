package InsertionSort;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = {1, 10, 9, 3, 4, 1, 43, -5, -4};
		InsSort sorter = new InsSort();
		
		System.out.print("Tablica nieposortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}
		
		sorter.sort(tab);
		System.out.println();
		
		System.out.print("Tablica posortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}
	}
}
