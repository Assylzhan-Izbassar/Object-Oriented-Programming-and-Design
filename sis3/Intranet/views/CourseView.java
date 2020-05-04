package views;

import java.util.Set;

import entities.Course;

public class CourseView {
	public static void showUsers(Set<Course> courses) {
		for(Course course : courses) {
			System.out.println(course.toString());
		}
	}
}
