package sis;

import java.util.Vector;

public class DragonLaunch {
	
	private Vector<Person> students;

	public DragonLaunch()
	{
		students = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		students.add(p);
	}
	
	public String willDragonEatOrNot() {
		
		String answer = "YES!";
		
		for(int i=0; i < students.size(); ++i){
			
			if(i == students.size() - 1)
				break;
			if(students.elementAt(i).gen == Gender.Male 
					&& students.elementAt(i+1).gen == Gender.Female){
				students.removeElementAt(i);
				students.removeElementAt(i);
				i=0;
				i--;
			}
		}
		
		if(students.isEmpty())
			answer = "NO!";
		
		return answer;
	}
	
	public int getLeavesPersons()
	{
		if(willDragonEatOrNot() != "NO")
			return students.size();
		
		return 0;
	}
	
	public void printArray()
	{
		for(int i=0; i < students.size(); ++i)
		{
			System.out.println(students.elementAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		DragonLaunch dl = new DragonLaunch();
		
		Person p = new Person("A", 18, Gender.Male);
		Person p1 = new Person("B", 19, Gender.Male);
		Person p2 = new Person("E", 20, Gender.Female);
		Person p3 = new Person("A", 18, Gender.Male);
		Person p4 = new Person("S", 18, Gender.Female);
		Person p5 = new Person("S", 18, Gender.Female);
		
		//dl.kidnap(p);
		//dl.kidnap(p1);
		dl.kidnap(p2);
		dl.kidnap(p3);
		dl.kidnap(p4);
		//dl.kidnap(p5);
		String s = dl.willDragonEatOrNot();
		
		System.out.println(s);

		System.out.println(dl.getLeavesPersons());
	}

}
