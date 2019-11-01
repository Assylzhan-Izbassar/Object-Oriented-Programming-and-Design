package task2;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>{

	protected double salary;
	protected Date hearDate;
	protected String insuranceNumber;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String address,double salary, Date hearDate, String insuranceNumber)
	{
		super(name,address);
		this.salary = salary;
		this.hearDate = hearDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || o.getClass() != this.getClass()) return false;
		
		Employee e = (Employee)o;
		
		return super.equals(o) && salary == e.salary && insuranceNumber.equals(e.insuranceNumber);
		
	}
	public String toString()
	{
		return super.toString() + ". salary: " + salary + " hearDate: " + hearDate + ". insuranceNumber: " + insuranceNumber; 
	}
	public int hashCode(){
		return 14*31+name.hashCode();
	}

	@Override
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1;
		else if(this.salary < e.salary) return -1;
		return 0;
	}
}
