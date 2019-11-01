package task1;

public class Mercedes extends Car{

	{
		model = "Mercedes";
	}
	
	@Override
	protected void drive() {
		System.out.println(model + "drove");
		
	}
	@Override
	protected void signal() {
		System.out.println("Bump!");
		
	}
}
