package lab2;

enum DogCommands
{
	NONE,
	SIT,
	ROLL_OVER,
	COME,
	WATCH_ME
}

public class Dog {
	
	private String name;
	private int age;
	private final String colorOfeyes;
	private static int numberOfmyDogs = 0;
	static DogCommands dc = DogCommands.NONE;
	
	//initialization block
	{
		numberOfmyDogs++;
	}
	
	public Dog(String name,String colorOfeyes)
	{
		this.name = name;
		this.colorOfeyes = colorOfeyes;
	}
	
	public Dog(String name, int age, String colorOfeyes)
	{
		this(name,colorOfeyes);
		this.age = age;
	}
	//overloading method roll_over
	public void roll_over()
	{
		System.out.println(name + " is rolled over");
	}
	public void roll_over(int x)
	{
		System.out.println(name + " is " + x + " times" + " rolled over");
	}
	//enum's actions
	public static void takeAction(DogCommands command)
	{
		switch(command)
		{
		case SIT:
			System.out.println("Your dog is sitting!");
			dc = DogCommands.SIT;
			break;
		case ROLL_OVER:
			System.out.println("Your dog is rolled over!");
			dc = DogCommands.ROLL_OVER;
			break;
		case COME:
			System.out.println("Your dog is coming!");
			dc = DogCommands.COME;
			break;
		case WATCH_ME:
			System.out.println("Your dog is watching you!");
			dc = DogCommands.WATCH_ME;
			break;
		default:
			dc = DogCommands.NONE;
			break;
		}
	}
	//read-only fields
	public int getAge()
	{
		return age;
	}
	public String getColorOfeyes()
	{
		return colorOfeyes;
	}

	public static void main(String[] args)
	{
		Dog myDog = new Dog("Simba", 6, "Brown");
		DogCommands myCommand = DogCommands.SIT;
		myDog.roll_over(5);
		Dog.takeAction(myCommand);
		System.out.println(myDog.getAge());
		System.out.println(Dog.numberOfmyDogs);
	}
}
