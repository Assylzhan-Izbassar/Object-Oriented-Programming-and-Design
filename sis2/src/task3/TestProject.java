package task3;

import java.util.Collections;
import java.util.Vector;

public class TestProject {
	
	public static void main(String[] args) {
		
		Vector<Person> p = new Vector<Person>();
		
		Employee e = new Employee("AAA", "BBB", 4.4, "2323");
		Employee e1 = new Employee("AEA", "BLB", 4.5, "2523");
		Employee e2 = new Employee("AKA", "BMB", 2.4, "2423");
		Employee e3 = new Employee("ALA", "BRB", 4.6, "2326");
		
		p.add(e);
		p.add(e1);
		p.add(e2);
		p.add(e3);
		
		Collections.sort(p);
		
		Employee cloned = null;
		try {
			cloned = e.clone();
		} catch (CloneNotSupportedException ee) {
			ee.printStackTrace();
		}
		
		System.out.println(e);
		cloned.address = "CCC";
		System.out.println(cloned);
	}

}
