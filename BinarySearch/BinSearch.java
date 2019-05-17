package BinarySearch;

public class BinSearch {
	
	int search(int[] tab, int key) {
		
		int l = 0;
		int r = tab.length - 1;
		
		while(l <= r) {
			int m = (l + r) / 2;
			if (tab[m] == key) return m;
			else {
				if (tab[m]> key) r = m - 1;
				else l = m + 1;			
			}			
		}
	return -1;
	}

}
