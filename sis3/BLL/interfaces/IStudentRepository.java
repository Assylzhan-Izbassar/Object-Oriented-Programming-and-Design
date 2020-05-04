package interfaces;

import java.util.HashMap;

import entities.Course;
import entities.Mark;

public interface IStudentRepository {
	boolean courseRegister(Course course);
	HashMap<Course, Mark> getTranscript();
}
