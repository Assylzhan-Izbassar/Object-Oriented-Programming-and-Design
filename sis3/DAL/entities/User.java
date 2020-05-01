package entities;

import java.util.Date;

public class User {
	
	protected int id;
	protected String name;
	protected Date birthdate;
	protected int age;
	protected Role role;
	
	{
		id++;
	}
	
	public User(String name, Date birthdate, Role role) {
		this.name = name;
		this.birthdate = birthdate;
		this.role = role;
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

}
