package task3;

import java.util.Collection;

public interface MyCollection<T> {
	
	boolean add(MyCollection<T> x);
	
	void clear();
	
	boolean equals(Object o);
	
	boolean isEmpty();
	
	boolean remove(Object o);
	
	int size();
	
	int hashCode();
	
	boolean contains(Object o);
	
	<T> T[] toArray(T[] a);
}
