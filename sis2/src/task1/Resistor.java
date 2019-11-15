package task1;

public class Resistor extends Circuit{

	private double value;
	private double pottentialDifference;
	
	public Resistor(double value)
	{
		this.value = value;
		this.pottentialDifference = 0;
	}
	
	@Override
	public double getResistance() {
		return this.value;
	}

	@Override
	public double getPotentialDiff() {
		return this.pottentialDifference;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.pottentialDifference = V;
	}
	
	public void setResistance(double newValue)
	{
		this.value = newValue;
	}
	
	public double getPottentialDifference()
	{
		return this.pottentialDifference;
	}
	public void setPottentialDifference(double pottentialDifference)
	{
		this.pottentialDifference = pottentialDifference;
	}

}
