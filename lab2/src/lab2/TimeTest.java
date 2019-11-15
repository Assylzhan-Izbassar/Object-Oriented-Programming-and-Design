package lab2;

public class TimeTest {

	public static void main(String[] args) {
		  
		Time t1 = new Time(16,59,59);
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandart());
		Time t2 = new Time(22,35,00);
		t1.add(t2);
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandart());
	}
}
