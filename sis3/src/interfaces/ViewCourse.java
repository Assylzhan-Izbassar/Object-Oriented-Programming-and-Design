package interfaces;
import java.util.Date;
import java.util.HashMap;

import logic.Course;
import logic.CourseFile;
import logic.Teacher;

/**
*/
public interface ViewCourse {
/**
 * @param file 
 * @return 
*/
public String viewFiles(CourseFile file);
/**
 * @param teacher 
 * @return 
*/
public String viewInfoAboutTheTeacher(Teacher teacher);
/**
 * @param course 
 * @return 
*/
public HashMap<Double,Date> viewMarks(Course course);
}

