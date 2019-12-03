package logic;

/**
 */
public class Course {

    private String name;
    private String courseID;
    private int creditNumber;

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
     * @return 
     */
    public int getCreditNumber() {
        return this.creditNumber;
    }

    /**
     * @param credit 
     */
    public void setCreditNumber(int credit) {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
}

