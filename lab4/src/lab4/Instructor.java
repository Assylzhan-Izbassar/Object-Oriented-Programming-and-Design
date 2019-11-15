package lab4;

import java.io.Serializable;

public class Instructor implements Serializable{
	
	private String firstName = null,lastName = null,department=null, email=null;

	public Instructor(String firstName, String lastName,
			String department, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String newEmail)
	{
		email = newEmail;
	}
	
	public String toString()
	{
		return firstName + " " + lastName + " " + department + " " + email;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || !(o instanceof Instructor))return false;
		
		Instructor ins = (Instructor)o;
		
		return firstName.equals(ins.firstName) && lastName.equals(ins.lastName) 
				&& department.equals(ins.department) && email.equals(ins.email);
	}
	
	public int hashCode()
	{
		return this.firstName.hashCode() * this.lastName.hashCode();
	}
}
