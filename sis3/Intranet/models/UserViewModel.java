package models;

import java.util.Calendar;
import java.util.Date;

import entities.Role;

public class UserViewModel {
	
	protected String name;
	protected Date birthdate;
	protected int age;
	protected Role role;
	
	public UserViewModel() {
		
	}
	@SuppressWarnings("deprecation")
	public UserViewModel(String name, Date birthdate, Role role) {
		this.name = name;
		this.birthdate = birthdate; 
		this.role = role;
		this.age = Calendar.getInstance().getTime().getYear() - birthdate.getYear();
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
	
	public String getRole() {
		return this.role.getRoleName();
	}
	
	public String toString() {
		return "User's name is " + this.name + ". He/she is " + this.age + " years old." 
				+ " His/her role is " + role.toString(); 
	}
}
