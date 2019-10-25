package lab3;

public class Wolf extends Animal{
	
	//initialization block
	{
		type = "Wolf";
	}
	//initialize the class
	public Wolf() {super();}

	public Wolf(String voice, String food)
	{
		super(voice, food);//call the constructor parent(Animal) class of Wolf
	}
	public Wolf(String type, String voice, String food, String area)
	{
		this(voice,food);
		this.type = type;
		this.setArea(area);
	}
	public void eatFood(String s)
	{
		System.out.println(type + " is eating the" + s);
	}
	public void goSleep()
	{
		System.out.println(type + "is sleeping.");
	}
}
