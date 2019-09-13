package lab2;

import java.util.Scanner;

public class Student {
	
	private String name;
	private int id;
	private int year_of_study;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
		year_of_study = 1;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public int getYear()
	{
		return ++year_of_study;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		Student s = new Student(name, 2);
		
		System.out.println(s.getName() + " " + s.getYear());
		
		in.close();
	}

}
