package entities;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.List;

public class Course implements Serializable  {
	
	private static final long serialVersionUID = -3191977710217367973L;
	public int id;
	public String name;
	public int credit;
	public GregorianCalendar startingDate;
	public GregorianCalendar endingDate;
	public List<Student> students;
	public Teacher teacher;
	
	{
		id++;
	}
	
	public Course(String name, int credit) {
		this.name = name;
		this.credit = credit;
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
	
	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String getTeacher() {
		return this.teacher.toString();
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	public void setStudents(List<Student> students) {
		this.students.clear();
		for(Student student : students) {
			this.students.add(student);
		}
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public String toString() {
		return "Course is: " + this.name + " with " + this.credit + " credit.";
	}

}
