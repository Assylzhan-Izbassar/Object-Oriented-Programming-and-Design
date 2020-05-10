package intranet;

import java.io.IOException;
import java.util.Scanner;

import controllers.UserController;
import views.UserView;

public class Driver {

	public static void main(String[] args) throws IOException {
		UserController controller = new UserController();
		UserView.insertUser();
		controller.index();
//		Scanner in = new Scanner(System.in);
//		int id = in.nextInt();
//		controller.details(id);
//		in.close();
	}

}
