package task3;

import java.util.Comparator;

public class CompByHireDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.hearDate.compareTo(o2.hearDate);
	}

}
