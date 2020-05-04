package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Student extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	protected HashMap<Course, List<Mark>> courses;

	public Student(String name, Date birthdate) {
		super(name, birthdate, new Role("student"));
	}
}
