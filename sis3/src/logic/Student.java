package logic;

import interfaces.ViewCourse;

import java.util.Date;
import java.util.HashMap;
/**
*/
public class Student extends User implements ViewCourse {

	private HashMap<Course, Mark> courses;
	private CourseFile courseFile;
	private HashMap<Course, Double> transcript;
	
	/**
	 * @param course 
	 * @return 
	*/
	public boolean register(Course course) {
	    return false;
	}
	/**
	 * @return 
	*/
	public HashMap<Course, Double> getTranscript() {
	    return this.transcript;
	}
	/**
	 * @return 
	*/
	public String toString() {
	    return null;
	}
	/**
	 * @param Object o 
	 * @return 
	*/
	public boolean equals(Object o) {
	    return false;
	}
	/**
	 * @return 
	*/
	public int hashCode() {
	    return 0;
	}
	/**
	 * @param teacher 
	 * @param rateNumber 
	 * @return 
	*/
	public boolean rating(Teacher teacher, double rateNumber) {
	    return false;
	}
	/**
	 * @param course 
	 * @return 
	*/
	public HashMap<Course,Mark> getCourseInfo(Course course) {
	    return null;
	}
	/**
	 * @param file 
	 * @return 
	*/
	public String viewFiles(CourseFile file) {
	    return null;
	}
	/**
	 * @param teacher 
	 * @return 
	*/
	public String viewInfoAboutTheTeacher(Teacher teacher) {
	    return null;
	}
	
	@Override
	public HashMap<Double, Date> viewMarks(Course course) {
		return null;
		
	}
	public HashMap<Course, Mark> getCourses() {
		return courses;
	}
	public void setCourses(HashMap<Course, Mark> courses) {
		this.courses = courses;
	}
	public CourseFile getCourseFile() {
		return courseFile;
	}
	public void setCourseFile(CourseFile courseFile) {
		this.courseFile = courseFile;
	}
}

