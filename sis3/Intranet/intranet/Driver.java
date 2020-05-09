package intranet;

import java.io.IOException;
import controllers.UserController;
import views.UserView;

public class Driver {

	public static void main(String[] args) throws IOException {
		UserController controller = new UserController();
		UserView.insertUser();
		controller.index();
	}

}
