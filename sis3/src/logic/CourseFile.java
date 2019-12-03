package logic;

import java.util.Vector;

import interfaces.Serializable;

/**
 */
public class CourseFile implements Serializable {
    /**
     */
    private Vector<Course> courses;
    
    public CourseFile(Vector<Course> courses)
    {
    	this.courses = courses;
    }

    /**
     * @return 
     */
    public Vector<Course> getCourses() {
        return courses;
    }
}

