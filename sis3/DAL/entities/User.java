package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class User implements Serializable, Comparable<User> {
	
	private static final long serialVersionUID = 1L;
	protected int id;
	protected String name;
	protected Date birthdate;
	protected int age;
	protected Role role;
	protected static int count = -1;
	
	{
		++count;
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
		this.id = count;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "User's name is " + this.name + ", with id: " + this.id + ". He/she is " + this.age + " years old." 
				+ " His/her role is " + role.toString(); 
	}
	public int compareTo(User user) {
		return this.getName().compareTo(user.getName());
	}
	
	public int hashCode() {
		//return (this.getName().hashCode() * this.getAge()) % this.role.hashCode();
		return this.getId();
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof User)) return false;
		
		User user = (User) o;
		
		return this.getName().equals(user.getName()) &&
				this.getAge() == user.getAge() &&
				this.getBirthdate().equals(user.getBirthdate());
	}

}
