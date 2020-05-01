package dal;
import java.util.Set;

import entities.Course;
import entities.Role;
import entities.Student;
import entities.Teacher;
import entities.User;

public class DBContext {
	public Set<User> users;
	public Set<Student> students;
	public Set<Role> roles;
	public Set<Teacher> teachers;
	public Set<Course> courses;
}
