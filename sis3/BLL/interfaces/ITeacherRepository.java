package interfaces;

import entities.Course;
import entities.Student;

public interface ITeacherRepository {
	boolean putMark(Student student, Course course, double mark);
}
