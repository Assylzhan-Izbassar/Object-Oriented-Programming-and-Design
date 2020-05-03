package intranet;
import implementations.UserRepository;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import entities.Role;
import entities.User;

public class Driver {

	public static void main(String[] args) throws IOException {
		UserRepository userRep = new UserRepository();
		User user = new User("Assyl", new Date(101,05,29), new Role("admin"));
		userRep.addUser(user);
		
		Set<User> users = userRep.getUsers();
		
		for(User User : users) {
			System.out.println(User.toString());
		}
		
	}

}
