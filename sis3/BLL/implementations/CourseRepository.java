package implementations;

import java.io.Serializable;
import java.util.Set;

import dal.DBContext;
import entities.Course;
import interfaces.ICourseRepository;

public class CourseRepository extends BaseRepository implements Serializable, ICourseRepository {

	private static final long serialVersionUID = -7166642484245561687L;
	private DBContext dbContext;
	private String dbPath = "DB/courses.txt";
	
	public CourseRepository() {
		dbContext = new DBContext();
	}

	@Override
	public Set<Course> getCourses() {
		@SuppressWarnings("unchecked")
		Set<Course> courses = (Set<Course>)super.extractObject(this.dbPath);
		return courses;
	}

	@Override
	public Course getCourseById(int id) {
		Set<Course> courses = this.getCourses();
		
		if(id - 1 < courses.size()) {
			for(Course course : courses) {
				if(course.getId() == id) {
					return course;
				}
			}
		}
		return null;
	}

	@Override
	public boolean insertCourse(Course newCourse) {
		if(newCourse != null) {
			this.dbContext.courses.add(newCourse);
			this.save();
			return true;
		}
		return false;
	}

	@Override
	public boolean removeCourse(int id) {
		
		Course oldCourse = this.getCourseById(id);
		if(oldCourse != null) {
			this.dbContext.courses.remove(oldCourse);
			this.save();
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean updateCourse(int id, Course newCourse) {
		this.removeCourse(id);
		newCourse.setId(id);
		return this.insertCourse(newCourse);
	}

	@Override
	public boolean save() {
		Set<Course> courses = this.getDbContext().courses;
		return super.saveObject(courses, this.dbPath);
	}

	public DBContext getDbContext() {
		return dbContext;
	}

	public void setDbContext(DBContext dbContext) {
		this.dbContext = dbContext;
	}

	public String getDbPath() {
		return dbPath;
	}

}
