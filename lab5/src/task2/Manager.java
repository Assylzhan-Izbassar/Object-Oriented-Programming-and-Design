package task2;

import java.util.Objects;
import java.util.Vector;


public class Manager extends Employee{

	Vector<Employee> employees = new Vector<Employee>();
	int bonus;

	public Manager() {
		super();
	}

	public Manager(Vector<Employee> v, int bonus)
	{
		this();
		this.bonus = bonus;
		for(int i=0; i < v.size(); ++i)
		{
			employees.add(v.elementAt(i));
		}
	}

	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || !(o instanceof Manager))
			return false;
		Manager m = (Manager)o;

		return Objects.equals(m.employees, employees); 
	}

	public int compareTo(Manager m) {
		if(this.salary > m.salary) return 1;
	    if(this.salary < m.salary) return -1;
		if(this.bonus > m.bonus) return 1;
		if(this.bonus < m.bonus) return -1;
		return 0;
	}
}
