package task2;

public class Multiply extends Operator {

	@Override
	public void execute(int anotherValue) {
		initialValue = initialValue * anotherValue;
	}
}
