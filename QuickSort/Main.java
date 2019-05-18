package QuickSort;

public class Main {
	
	public static void main(String[] args) {
		
		int[] tab = {1, 5, 4, 9, 3, 0, -2, 6, 10, 1, 12};
		QSort sorter = new QSort();
						
		System.out.print("Tablica nieposortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}
		
		sorter.qSort(tab, 0, tab.length-1);
		System.out.println();
		
		System.out.print("Tablica posortowana: ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print("["+tab[i]+"]");
		}	
	}
}
