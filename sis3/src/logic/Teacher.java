package logic;

import java.util.HashMap;

import enums.TeacherLevel;
import interfaces.ManageCourse;

/**
 */
public class Teacher extends Employee implements ManageCourse {
    /**
     */
    private CourseFile courses;

    /**
     */
    private HashMap<Student, Mark> students;

    /**
     */
    private TeacherLevel level;

    /**
     * @param student 
     * @param mark 
     * @return 
     */
    public boolean putMarks(Student student, double mark) {
        return false;
    }

    /**
     * @param message 
     * @return 
     */
    public boolean sendOrder(String message) {
        return false;
    }

    /**
     * @return 
     */
    public String toString() {
        return null;
    }

    /**
     * @param o 
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
     * @param file 
     * @return 
     */
    public String viewCourse(CourseFile file) {
        return null;
    }

    /**
     * @param course 
     * @return 
     */
    public boolean addCourse(Course course) {
        return false;
    }

    /**
     * @param course 
     * @return 
     */
    public boolean deleteCourse(Course course) {
        return false;
    }

	public TeacherLevel getLevel() {
		return level;
	}

	public void setLevel(TeacherLevel level) {
		this.level = level;
	}

	public HashMap<Student, Mark> getStudents() {
		return students;
	}

	public void setStudents(HashMap<Student, Mark> students) {
		this.students = students;
	}

	public CourseFile getCourses() {
		return courses;
	}

	public void setCourses(CourseFile courses) {
		this.courses = courses;
	}
}

