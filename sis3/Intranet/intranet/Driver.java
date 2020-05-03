package intranet;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import implementations.UserRepository;
import entities.Role;
import entities.User;
import views.Index;
import views.UserView;

public class Driver {

	public static void main(String[] args) throws IOException {
		Index.mainPage(true);
		
		UserRepository userRep = new UserRepository();
		User user = new User("Assyl", new Date(101,05,29), new Role("admin"));
		User user2 = new User("John", new Date(106,05,9), new Role("user"));
		userRep.addUser(user);
		userRep.addUser(user2);
		
		System.out.println(userRep.getUserById(2));
		
		Set<User> users = userRep.getUsers();
		
		UserView.showUsers(users);
		
	}

}
