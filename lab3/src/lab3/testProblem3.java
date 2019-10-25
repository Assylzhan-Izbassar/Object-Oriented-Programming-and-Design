package lab3;

import java.util.HashSet;

public class testProblem3 {

	public static void main(String[] args) {
		
		Employee e = new Employee("AAA", "Almaty", 1000, 4,"AS32");
		Employee e1 = new Employee("AAA", "Almaty", 1000, 4,"AS32");
		Employee e2 = new Employee("AAB", "Shymkent", 1030, 4,"AD32");
		
		HashSet<Employee> hs = new HashSet<Employee>();
		
		hs.add(e);
		hs.add(e1);
		hs.add(e2);
		
		System.out.print(hs);
	}

}
