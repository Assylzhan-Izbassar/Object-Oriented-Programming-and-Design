package task2;

public class Add extends Operator {
	
	@Override
	public void execute(int anotherValue) {
		initialValue = initialValue + anotherValue;
	}
}
