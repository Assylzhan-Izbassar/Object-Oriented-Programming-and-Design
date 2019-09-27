package lab3;

public class Animal{
	
	private String voice;
	private String food;
	private int dayOfBirth;
	
	public Animal()
	{
	}
	
	public Animal(String voice)
	{
		this.voice = voice;
	}
	
	public Animal(String voice, String food)
	{
		this(voice);
		this.food = food;
	}
	
	public Animal(String voice, String food, int dayOfBirth)
	{
		this(voice, food);
		this.dayOfBirth = dayOfBirth;
	}
	
	public String getVoice()
	{
		return voice;
	}
	
	public void move()
	{	
		System.out.println("Animal is moving");
	}
	
	public void run()
	{
		System.out.println("Animal is running");
	}
}
