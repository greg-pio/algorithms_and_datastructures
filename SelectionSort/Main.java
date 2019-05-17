package SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = {5, 4, 3, 7, 1, 2, 10, 9, 18};
		
		System.out.print("Tablica nieposortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}	
		
		SelSort sorter = new SelSort();
		sorter.selSorter(tab);
		System.out.println();
		
		System.out.print("Tablica posortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}	
		
	}
}
