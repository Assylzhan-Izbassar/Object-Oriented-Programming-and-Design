package intranet;

import java.io.IOException;

import controllers.UserController;
import views.Index;

public class Driver {

	public static void main(String[] args) throws IOException {
		Index.mainPage(true);
		UserController controller = new UserController();
		controller.index();
	}

}
