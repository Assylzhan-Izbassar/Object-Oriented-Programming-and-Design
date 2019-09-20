package sis;

import sis.Gender;

public class Person {
	
	String name;
	int age;
	Gender gen;
	
	public Person()
	{
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Gender gen)
	{
		this(name,age);
		this.gen = gen;
	}
	
	public String toString(){
		String maleOrFemale = gen == Gender.Male? "He":"She";
		return maleOrFemale + "'s name is " + name + ", and " + maleOrFemale
				+ "'s " + age + " years old.";
	}
}
