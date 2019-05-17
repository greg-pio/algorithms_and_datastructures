package TournamentAlg;

public class Tournament {
		
	int findMin(int[] tab, int l, int r) {
		
		// jesli jest tylko jeden element
		if (l == r) {
			return tab[l];
		}
		
		// jesli sa dwa elementy
		if(r == l + 1) {
			if(tab[l] < tab[r]) return tab[l];
			else return tab[r];
		}
		
		//jesli elementow jest wiecej niz dwa
		int m = (l + r) / 2;
		
		int min_left = findMin(tab, l, m);
		int min_right = findMin(tab, m+1, r);
		
		int min;
		
		if (min_left < min_right) min = min_left;
		else min = min_right;
		
		return min; 			
		
	}	
}
