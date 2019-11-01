package task1;

public abstract class Car {
	
	protected String model;
	
	public Car() {}
	
	public Car(String model)
	{
		this.model = model;
	}
	
	protected abstract void drive();
	
	protected abstract void signal(); 
	
	protected void openCar()
	{
		System.out.println(model + "is opened");
	}
	
	public String getModel()
	{
		return model;
	}
}
