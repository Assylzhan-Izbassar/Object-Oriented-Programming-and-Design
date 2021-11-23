package task2;

public class Substract extends Operator {
	
	@Override
	public void execute(int anotherValue) {
		initialValue = initialValue - anotherValue;
	}
}
