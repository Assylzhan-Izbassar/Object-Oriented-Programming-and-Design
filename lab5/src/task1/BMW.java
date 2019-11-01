package task1;

public class BMW extends Car implements ShowModel,Radio{

	{
		model = "BMW";
	}
	@Override
	public void turnedOn() {
		System.out.println("Radio is turned on.");
	}

	@Override
	public void turnedOff() {
		System.out.println("Radio is turned off.");
	}

	@Override
	public void show() {
		System.out.println(model);
	}

	@Override
	protected void drive() {
		System.out.println(model + "is drove.");
	}

	@Override
	protected void signal() {
		System.out.println("Bee!");
	}

}
