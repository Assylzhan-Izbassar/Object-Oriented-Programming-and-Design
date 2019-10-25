package lab3;

import java.util.HashSet;

public class testProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Almaz", "Shymkent");
		Student s = new Student("Assylzhan", "Almaty", "OOP", 2, 3.5);
		Staff st = new Staff("Tolganay", "Almaty", "#8", 300);
		
		HashSet<Person> people = new HashSet<Person>();
		
		people.add(p);
		people.add(s);
		people.add(st);
		
		System.out.println(people);
	}

}
