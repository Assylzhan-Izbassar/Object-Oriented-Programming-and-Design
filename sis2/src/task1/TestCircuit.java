package task1;

public class TestCircuit { // -0.2 = 1.8

	public static void main(String[] args) {
		
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0); 
		Circuit c = new Resistor(6.0); 
		Circuit d = new Resistor(3.0); 
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d); 
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f); 
		double R = circuit.getResistance();
		
		circuit.applyPotentialDiff(10);
		
		double V = circuit.getPotentialDiff();
		
		double P = circuit.getPower();
		double I = circuit.getCurrent();
		
		System.out.println(R);
		System.out.println(V);
		System.out.println(I);
		System.out.println(P);
	}
}
