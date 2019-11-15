package task3;

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
