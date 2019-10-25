package lab3;


public class Employee extends Person{
	
	protected double salary;
	protected int year;
	protected String insuranceNumber;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String address,double salary, int year, String insuranceNumber)
	{
		super(name,address);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || o.getClass() != this.getClass()) return false;
		
		Employee e = (Employee)o;
		
		return super.equals(o) && salary == e.salary && insuranceNumber.equals(e.insuranceNumber) && year == e.year;
		
	}
	public String toString()
	{
		return super.toString() + ". salary: " + salary + " year: " + year + ". insuranceNumber: " + insuranceNumber; 
	}
	public int hashCode(){
		return 14*31+name.hashCode();
	}
}
