package lab3;

public abstract class Animal{
	
	protected String type;
	private String voice;
	private String food;
	private String area;
	
	public Animal() {};
	
	public Animal(String type) 
	{
		this.type = type;
	}
	
	public Animal(String voice, String food)
	{
		this.voice = voice;
		this.food = food;
	}
	public Animal(String voice, String food, String area)
	{
		this(voice, food);
		this.area = area;
	}
	
	public String getVoice(){return voice;}
	
	public String getArea() {return area;}
	
	public String getFood() {return food;}
	
	public void setArea(String area)
	{
		this.area = area;
	}
			
	public void goSleep()
	{
		System.out.println("Fall asleep.");
	}
	
	public void eatFood()
	{
		System.out.println(type + " is eating.");
	}
}
