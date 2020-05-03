package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class User implements Serializable {
	
	protected int id;
	protected String name;
	protected Date birthdate;
	protected int age;
	protected Role role;
	
	{
		id++;
	}
	/**
	 *@param String name,
	 *@param Date birthday,
	 *@param Role role.
	*/
	@SuppressWarnings("deprecation")
	public User(String name, Date birthdate, Role role) {
		this.name = name;
		this.birthdate = birthdate;
		this.role = role;
		GregorianCalendar now = new GregorianCalendar();
		this.age = now.getTime().getYear() - birthdate.getYear();
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthdate() {
		return this.birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "User's name is " + this.name + ". He/she is " + this.age + " years old." 
				+ " His/her role is " + role.toString(); 
	}

}
