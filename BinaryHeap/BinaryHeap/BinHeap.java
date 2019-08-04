package BinaryHeap;

import Person.Person;

public class BinHeap {
	
	public BinNode[] tab;
	public int counter;
	
	BinHeap(Person root, int priority) {
		counter = 1;
		tab = new BinNode[10];
		BinNode rt = new BinNode(root, priority);	
		tab[counter++] = rt;
	}
		
	int parent(int i)
	{
	    return i/2;
	}

	public void upheap(int i) {
	    while((i > 1) && (tab[i].getPriority() < tab[parent(i)].getPriority())) {
	        BinNode temp = tab[parent(i)]; 
	        tab[parent(i)] = tab[i];
	        tab[i] = temp;
	        i = parent(i);
	    }
	}
	
	public void downheap(int i) {
	    int l = 2 * i;
	    int r = 2 * i + 1; 
	    int small = i;     
	    if(l<counter && tab[l].getPriority() < tab[small].getPriority())
	         small = l;
	    if(r<counter && tab[r].getPriority() < tab[small].getPriority())
	         small = r;
	    if(small!=i)
	    {
	        BinNode temp = tab[i];
	        tab[i] = tab[small];
	        tab[small] = temp;
	        downheap(small); 
	    }
	}
	
	public void insert(Person p, int priority) {
		BinNode node = new BinNode(p, priority);
		tab[counter++] = node;
		upheap(counter-1);
	}
	
	public BinNode findMin() {
		return tab[1];
	}
	
	public void delMin() {
		tab[1] = tab[--counter];
		tab[counter] = null;
		downheap(1);
	}
	
	public void showTree() {
		for (int i = 1; i < tab.length; i++) {
			if(tab[i] != null) {
			System.out.println(i + " - " + tab[i].toString());
			}
		}
	}
}
