package sis;

import java.util.Scanner;

import lab2.Student; 

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		GradeBook gb = new GradeBook();
		
		Course cs = new Course("CS101", "OOP");
		
		gb.setCourse(cs);
		
		Student s1 = new Student("A", 13);
		Student s2 = new Student("B", 15);
		Student s3 = new Student("C", 12);
		
		gb.push_back(s1);
		gb.push_back(s2);
		gb.push_back(s3);
		
		double k;
		
		System.out.println("Please, input grades for students:");
		for(int i=0; i < gb.myStudent.size(); ++i)
		{
			System.out.println("Student " + gb.myStudent.elementAt(i).getName());
			k = in.nextDouble();
			gb.push_back(k);
			gb.Run(k, gb.myStudent.elementAt(i));
		}
		gb.displayMessage();
		gb.displayGradeReport();
		
		in.close();

	}

}
