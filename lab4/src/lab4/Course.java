package lab4;

import java.io.Serializable;

public class Course implements Serializable{
	
	private String courseTitle;
	private TextBook tb;
	private Instructor instr;
	
	public Course(String courseTitle, TextBook tx, Instructor instr)
	{
		this.courseTitle = courseTitle;
		this.tb = tx;
		this.instr = instr;
	}
	
	public Course(String courseTitle)
	{
		this.courseTitle = courseTitle;
	}
	
	public Course(String isbn, String title, String authors,
			String firstName, String lastName, String department, String email)
	{
		tb = new TextBook(isbn, title, authors);
		instr = new Instructor(firstName, lastName, department, email);
	}
	
	public String getCourceTitle()
	{
		return courseTitle;
	}
	public void setCourceTitle(String newCourceTitle)
	{
		courseTitle = newCourceTitle;
	}
	
	public TextBook getTextBook()
	{
		return tb;
	}
	public void setTextBook(TextBook newTb)
	{
		tb = newTb;
	}
	
	public Instructor getInstructor()
	{
		return instr;
	}
	public void setInstructor(Instructor newInstr)
	{
		instr = newInstr;
	}
	
	public String toString()
	{
		return courseTitle;
	}
	
	public boolean equals(Object o)
	{
		if(o == this)return true;
		if(o == null || !(o.getClass() != this.getClass()))return false;
		
		Course c = (Course)o;
		
		return courseTitle.equals(c.courseTitle) && tb.equals(c.tb) && instr.equals(c.instr);
	}
	public int hashCode()
	{
		return this.courseTitle.hashCode() % this.instr.hashCode();
	}
}
