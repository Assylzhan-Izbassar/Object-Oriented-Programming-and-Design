package task3;

public class Person implements Comparable<Person>{

	protected String name;
	protected String address;
	
	public Person()
	{
	}
	
	public Person(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || o.getClass() != this.getClass())
			return false;
		
		Person p = (Person)o;
		
		return name.equals(p.name) && address.equals(p.address);
	}
	
	public String toString()
	{
		return "Name is " + name + ", " + "address is " + address;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	
	public Person clone() throws CloneNotSupportedException
	{
		return (Person)super.clone();//
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}
