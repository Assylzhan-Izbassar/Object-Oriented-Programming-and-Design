package views;

import java.util.Set;

import models.UserViewModel;

public class UserView {
	
	public static void showUsers(Set<UserViewModel> users) {
		for(UserViewModel User : users) {
			System.out.println(User.toString());
		}
	}
	public static void details(UserViewModel user) {
		System.out.println("User's name:" + user.getName() + "\n" 
				+ "birthdate: " + user.getBirthdate() + "/n"
				+ "age: " + user.getAge() + "/n"
				+ "role: " + user.getRole());
	}
}
