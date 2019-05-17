package BinarySearch;

public class Main {

	public static void main(String[] args) {
		
		int[] tab = {1 ,4, 7, 2, 3, 9};
		int key = 4;
		
		BinSearch searcher = new BinSearch();
		
		int output = searcher.search(tab, key);
		
		if (output < 0)
			System.out.println("Szukanego klucza nie ma w tablicy.");
		else
			System.out.print("Indeks klucza w tablicy to: " + output);
		
	}
}
