package task1;

public class Series extends Circuit{
	
	private Resistor total;
	
	public Series(Circuit a, Circuit b)
	{
		total = new Resistor((a.getResistance() + b.getResistance()));;
	}
	
	@Override
	public double getResistance() {
		return this.total.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return total.getPottentialDifference();
	}

	@Override
	public void applyPotentialDiff(double V) {
		total.applyPotentialDiff(V);
	}
}
