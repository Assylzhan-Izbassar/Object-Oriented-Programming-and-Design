package task3;

import java.util.Comparator;

public class CompByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());//You should use encapsulation is it's protected field(getName()).
	}
}
