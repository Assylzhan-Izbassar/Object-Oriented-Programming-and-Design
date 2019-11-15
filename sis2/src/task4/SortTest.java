package task4;
import lab2.Time;
import task2.Employee;

public class SortTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("AAA", "BBB", 4.4, "2323");
		Employee e1 = new Employee("AEA", "BLB", 4.5, "2523");
		Employee e2 = new Employee("AKA", "BMB", 2.4, "2423");
		Employee e3 = new Employee("ALA", "BRB", 4.6, "2326");
		
		Comparable[] array = new Comparable[4];
		
		array[0] = e;
		array[1] = e1;
		array[2] = e2;
		array[3] = e3;
		
		Sort.mergeSort(array);
		
		for(int i=0; i < 4; ++i)
		{
			System.out.println(array[i]);
		}
	}

}
