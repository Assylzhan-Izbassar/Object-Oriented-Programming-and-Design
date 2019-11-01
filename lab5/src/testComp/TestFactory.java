package testComp;

import java.util.Collections;
import java.util.Vector;

public class TestFactory {

	public static void main(String[] args) {
		
		Vector<Factory> v = new Vector<Factory>();
		
		Factory f = new Factory("AstanaMotors", 1000, 100000);
		Factory f2 = new Factory("Alstom", 1200, 102000);
		Factory f3 = new Factory("PPT", 780, 17000);
		
		v.add(f);
		v.add(f2);
		v.add(f3);
		
		Collections.sort(v, new CompByName());
		
		for(Factory t : v)
		{
			System.out.println(t);
		}
		
		
	}

}
