package task3;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{

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
	
	public Manager clone() throws CloneNotSupportedException
	{
		Manager cloned = (Manager)super.clone();
		for(int i=0; i < employees.size(); ++i)
		{
			Employee temp = (Employee)employees.elementAt(i).clone();
			cloned.employees.add(temp);
		}
		return cloned;
	}
}
