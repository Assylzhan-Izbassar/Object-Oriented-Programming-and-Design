package task3;

import java.time.Instant;
import java.util.Date;

import testComp.Factory;

public class Employee extends Person implements Cloneable{

	protected double salary;
	protected Date hearDate;
	protected String insuranceNumber;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String address, double salary, String insuranceNumber)
	{
		super(name,address);
		this.salary = salary;
		this.hearDate = Date.from(Instant.now());
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
	
	public Employee clone() throws CloneNotSupportedException
	{
		Employee cloned = (Employee)super.clone();
		cloned.hearDate = (Date)this.hearDate.clone();
		return cloned;
	}
}
