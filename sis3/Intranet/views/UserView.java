package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import controllers.UserController;
import entities.Role;
import models.UserViewModel;

public class UserView {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static UserController controller = new UserController();
	
	//Users page
	public static void showUsers(Set<UserViewModel> users) {
		if(users == null){
			System.out.println("No users yet.");
			return;
		}
		for(UserViewModel User : users) {
			System.out.println(User.toString());
		}
	}
	//User details page
	public static void details(UserViewModel user) {
		System.out.println("User's name:" + user.getName() + "\n" 
				+ "birthdate: " + user.getBirthdate() + "/n"
				+ "age: " + user.getAge() + "/n"
				+ "role: " + user.getRole());
	}
	//Insert page
	public static void insertUser() throws IOException {
		System.out.println("Name: ");
		String name = in.readLine();
		
		System.out.println("Birthdate(in format 'dd/MM/yyyy'): ");
		String birthdate = in.readLine();
		
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Role of the user: ");
		String role = in.readLine();
		
		controller.insertUser(new UserViewModel(name, date, new Role(role)));
	}
}
