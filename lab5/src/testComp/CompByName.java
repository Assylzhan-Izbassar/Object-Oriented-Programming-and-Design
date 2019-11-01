package testComp;

import java.util.Comparator;

public class CompByName implements Comparator<Factory>{

	@Override
	public int compare(Factory o1, Factory o2) {
		return o1.name.compareTo(o2.name);
	}

}
