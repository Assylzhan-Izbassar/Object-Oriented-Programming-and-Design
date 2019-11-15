package task1;

public class Parallel extends Circuit{
	
	private Resistor total;
	
	public Parallel(Circuit a, Circuit b)
	{
		total = new Resistor((a.getResistance() * b.getResistance())/ (a.getResistance() + b.getResistance()));
	}
	
	@Override
	public double getResistance() {
		return total.getResistance();
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
