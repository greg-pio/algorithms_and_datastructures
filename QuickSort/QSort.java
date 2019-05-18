package QuickSort;

public class QSort {
	
	int partition(int tab[], int l, int r) {
	    
		int p = tab[r];
	    int i = (l-1);
	 
	    for (int j = l; j < r; j++) {
	        if (tab[j] <= p) {
	            i++;
	            int temp = tab[i];
	            tab[i] = tab[j];
	            tab[j] = temp;
	        }
	    }
	 
	    int temp = tab[i+1];
	    tab[i+1] = tab[r];
	    tab[r] = temp;
	 
	    return i+1;
	}
	
	public void qSort(int tab[], int l, int r) {
	    if (l < r) {
	        int k = partition(tab, l, r);
	        qSort(tab, l, k-1);
	        qSort(tab, k+1, r);
	    }
	}
}
