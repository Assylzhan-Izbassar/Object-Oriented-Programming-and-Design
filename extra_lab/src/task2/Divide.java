package task2;

public class Divide extends Operator {

	@Override
	public void execute(int anotherValue) {
		
		if(anotherValue == 0) {
			throw new IllegalArgumentException("Divide by zero!");
		}
		initialValue = initialValue / anotherValue;
	}
}
