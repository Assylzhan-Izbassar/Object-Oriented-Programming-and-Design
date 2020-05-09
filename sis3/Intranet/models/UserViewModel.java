package models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import entities.Role;

public class UserViewModel implements Serializable {
	
	private static final long serialVersionUID = 4201043825678843165L;
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
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof UserViewModel)) return false;
		
		UserViewModel userView = (UserViewModel) o;
		
		return this.name.equals(userView.getName()) 
				&& this.birthdate.equals(userView.getBirthdate())
				&& this.role.getRoleName().equals(userView.getRole())
				&& this.age == userView.getAge();
	}
	public int hashCode() {
		return this.getName().hashCode() % this.getAge();
	}
}
