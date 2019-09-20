package sis;

public class Course {
	String name;
	String description;
	int numberOfCredits;
	String[] prerequisite;
	
	public Course()
	{
	}
	
	public Course(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	public Course(String name, String description, int numberOfCredits)
	{	
		this(name, description);
		this.numberOfCredits = numberOfCredits;
	}
	
	public String toString(){
		return name + " " + description + " " + numberOfCredits + " ";
	}
}
