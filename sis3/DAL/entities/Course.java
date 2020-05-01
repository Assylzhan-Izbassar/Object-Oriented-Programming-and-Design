package entities;

import java.util.List;

public class Course {
	
	public int id;
	public String name;
	public int credit;
	public List<Student> students;
	public Teacher teacher;
	
	{
		id++;
	}
	
	public Course(String name, int credit) {
		this.name = name;
		this.credit = credit;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String getTeacher() {
		return this.teacher.toString();
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	public void setStudents(List<Student> students) {
		this.students.clear();
		for(Student student : students) {
			this.students.add(student);
		}
	}

}
