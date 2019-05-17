package SelectionSort;

public class SelSort {
	
	void selSorter(int[] tab) {	
		int i = 0;
		while (i < tab.length) {
			int mini = indexOfMin(tab, i);
			swap(tab, i, mini);
			i++;		
		}
	}
	
	int indexOfMin(int[] tab, int i) {
		int min = i;
		for(int a = i+1; a < tab.length; a++) {
			if (tab[a] < tab[min]) min = a;
		}
		return min;
	}
	
	void swap(int[] tab, int i, int mini) {
		int temp = tab[i];
		tab[i] = tab[mini];
		tab[mini] = temp;
	}

}
