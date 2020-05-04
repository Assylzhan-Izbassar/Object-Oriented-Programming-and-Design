package intranet;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import implementations.CourseRepository;
import implementations.UserRepository;
import entities.Course;
import entities.Role;
import entities.Student;
import entities.User;
import views.CourseView;
import views.Index;
import views.UserView;

public class Driver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		Index.mainPage(true);
		
		UserRepository userRep = new UserRepository();
		User user = new User("Assyl", new Date(101,05,29), new Role("admin"));
		User user2 = new User("John", new Date(106,05,9), new Role("user"));
		Student student = new Student("Tim", new Date(102, 03, 5));
		userRep.insertUser(user);
		userRep.insertUser(user2);
		userRep.insertUser(student);
		
		CourseRepository courseRep = new CourseRepository();
		Course course = new Course("Calculus", 4);
		
		courseRep.insertCourse(course);
		
		//System.out.println(userRep.getUserById(2));
		
		Set<User> users = userRep.getUsers();
		Set<Course> courses = courseRep.getCourses();
		
		CourseView.showUsers(courses);
		UserView.showUsers(users);
		
	}

}
