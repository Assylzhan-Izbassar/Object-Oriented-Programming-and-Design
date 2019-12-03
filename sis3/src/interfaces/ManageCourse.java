package interfaces;

import logic.*;

/**
 */
public interface ManageCourse {
    /**
     * @param file 
     * @return 
     */
    public abstract String viewCourse(CourseFile file);

    /**
     * @param course 
     * @return 
     */
    public boolean addCourse(Course course);

    /**
     * @param course 
     * @return 
     */
    public boolean deleteCourse(Course course);
}

