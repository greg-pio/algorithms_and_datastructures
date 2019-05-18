package InsertionSort;

public class InsSort {

	void sort (int[] tab) {
		
		for(int next = 1; next < tab.length; next++) {
			
			int curr = next;
			int temp = tab[next];
			
			while ((curr > 0) && (temp < tab[curr-1])){
				tab[curr] = tab[curr-1];
				curr--;		
			}
			tab[curr] = temp;		
		}
	}
}
