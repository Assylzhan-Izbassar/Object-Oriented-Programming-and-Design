package views;

public class Index {
	public static void mainPage(boolean isStart) {
		while(isStart) {
			System.out.println("Welcome to intranet!\n"
					+ "Please, select an option!");
			isStart = false;
		}
	}
}
