package interfaces;

import java.util.Set;
import entities.Course;

public interface ICourseRepository {
	
	Set<Course> getCourses();
	Course getCourseById(int id);
	boolean insertCourse(Course newCourse);
	boolean removeCourse(int id);
	boolean updateCourse(int id, Course newCourse);
	boolean save();
}
