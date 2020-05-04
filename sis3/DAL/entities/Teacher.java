package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Course> courses;

	public Teacher(String name, Date birthdate) {
		super(name, birthdate, new Role("teacher"));
	}
	public Teacher(String name, Date birthdate, ArrayList<Course> courses) {
		this(name, birthdate);
		for(Course course : courses) {
			this.courses.add(course);
		}
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses.clear();
		for(Course course : courses) {
			this.courses.add(course);
		}
	}
}
