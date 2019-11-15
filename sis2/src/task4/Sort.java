package task4;

import java.util.Vector;

public class Sort { // 1
	
	public Sort() {};
	
	static <E> void swap(E[] array, int i, int j)
	{
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E[] array)
	{
		for(int i=0; i < array.length; ++i)
		{
			for(int j=i; j < array.length; ++j)
			{
				if(array[i].compareTo(array[j]) < 0)
				{
					swap(array, i,j);
				}
			}
		}
	}
	
	static <E extends Comparable<E>> void mergeSort(E[] array)
	{
		mergeSort(array, 0, array.length-1);
	}
	
	private static <E extends Comparable<E>>void mergeSort(E[] array, int l,int r)
	{
		if(l < r)
		{
			int mid = (l+r)/2;
			
			mergeSort(array, l, mid);
			mergeSort(array, mid+1, r);
			merge(array, l,mid,r);
		}
	}
	private static <E extends Comparable<E>>void merge(E[] array, int l, int mid, int r)
	{
		int i,j,k;
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		Vector<E> L = new Vector<E>(10),
				R = new Vector<E>(10);
		
		for(i = 0; i < n1; ++i)
			L.add(array[l+i]);
		for(j = 0; j < n2; ++j)
			R.add(array[mid+j+1]);
		
		i = 0;
		j = 0;
		k = l;
		
		while(i < n1 && j < n2)
		{
			if(L.elementAt(i).compareTo(R.elementAt(j)) >= 0)
			{
				array[k] = L.elementAt(i);
				i++;
			}
			else
			{
				array[k] = R.elementAt(j);
				j++;
			}
			k++;
		}
		
		while(i < n1)
		{
			array[k] = L.elementAt(i);
			i++;
			k++;
		}
		
		while(j < n2)
		{
			array[k] = R.elementAt(j);
			j++;
			k++;
		}
	}
}
