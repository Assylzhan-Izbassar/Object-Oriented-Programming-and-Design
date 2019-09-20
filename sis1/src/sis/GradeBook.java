package sis;

import java.util.Vector;

import lab2.Student;

public class GradeBook {
	
	Course myCourse;
	Vector<Student> myStudent = new Vector<Student>();
	Vector<Double> grades = new Vector<Double>();
	
	private double high;
	private double low;
	private int sum;
	private int count;
	private double avg;
	
	private Student goodStudent;
	private Student notGoodStudent;
	
	String[] gradeDis = {"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ",
			"50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "100: "};
	public GradeBook(){
		high = 0;
		low = 101;
		sum = 0;
		count = 0;
		avg = 0;
		goodStudent = new Student();
		notGoodStudent = new Student();
		
	}
	
	public void displayMessage(){
		System.out.println("Welcome to the grade book for " + 
	myCourse.name + " " + myCourse.description + "!");
	}
	
	public void displayGradeReport(){
		System.out.println("\n" + "Class average is " + avg + "." + 
	" Lowest grade is " + low + " (Student " + notGoodStudent.getName() + ","
				+ "id: " + notGoodStudent.getId() + "." + " Highest grade is " + high + 
				" (Student " + goodStudent.getName() + ", " + "id: " + goodStudent.getId());
		outputBarChart();
	}
	
	public void Run(double x, Student s)
	{
		determineClassAverage(x);
		updLow(x,s);
		updHigh(x,s);
	}
	public void determineClassAverage(double x){
		sum += x;
		count++;
		avg = (sum/count);
	}
	
	public void outputBarChart() {
		System.out.println("\n" + "Grades distribution:");
		for(int i=0; i < 11; ++i)
		{
			System.out.print("\n" + gradeDis[i]);
			int index = 0;
			int left = 0;
			int right = 0;
			
			if(gradeDis[i] != "100: ")
			{
				String p = "";
				String w = "";
				for(int k=0; k < gradeDis[i].length(); ++k)
				{
					if(gradeDis[i].charAt(k) != '-')
					{
						p+=gradeDis[i].charAt(k);
					}
					else 
					{
						index = k;
						break;
					}
				}
				for(int k=index+1; k < gradeDis[i].length()-2; ++k) {
					w+=gradeDis[i].charAt(k);
				}
				left = Integer.parseInt(p);
				right = Integer.parseInt(w);
			}
			else {
				left = 100;
				right = 100;
			}
			
			for(int j=0; j < grades.size(); ++j)
			{
				if(grades.elementAt(j) >= left && grades.elementAt(j) <= right)
				{
					System.out.print('*' + " ");
				}
			}
		}
	}
	
	private void updLow(double x, Student s){
		if(x <= low)
		{
			low = x;
			notGoodStudent = s;
		}
	}
	
	private void updHigh(double x, Student s){
		if(x >= high)
		{
			high = x;
			goodStudent = s;
		}
	}
	
	public void push_back(Student s){
		myStudent.add(s);
	}
	public void push_back(double x){
		grades.add(x);
	}
	public double getAvg(){
		return avg;
	}
	
	public double getHigh() {
		return high;
	}
	
	public double getLow() {
		return low;
	}
	
	public void setCourse(Course c)
	{
		myCourse = c;
	}

}
