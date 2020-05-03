package views;

import java.util.Set;

import entities.User;

public class UserView {
	
	public static void showUsers(Set<User> users) {
		for(User User : users) {
			System.out.println(User.toString());
		}
	}
}
