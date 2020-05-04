package dal;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import entities.Course;
import entities.Role;
import entities.Student;
import entities.Teacher;
import entities.User;

public class DBContext implements Serializable {

	private static final long serialVersionUID = 5505335950066765256L;
	public Set<User> users;
	public Set<Student> students;
	public Set<Role> roles;
	public Set<Teacher> teachers;
	public Set<Course> courses;
	
	public DBContext() {
		users = new HashSet<User>();
		students = new HashSet<Student>();
		roles = new HashSet<Role>();
		teachers = new HashSet<Teacher>();
		courses = new HashSet<Course>();
	}
}
