package services;

import java.util.HashSet;
import java.util.Set;

import entities.Role;
import entities.User;
import models.UserViewModel;

public class UserServices {
	/**
	 * convert set of users into set to userViews
	 * @param Set<User> users*/
	public static Set<UserViewModel> userSetToUserViewSet(Set<User> users){
		Set<UserViewModel> userView = new HashSet<UserViewModel>();
		
		for(User user : users) {
			userView.add(UserServices.userToUserView(user));
		}
		return userView;
	}
	/**
	 * convert user to userView
	 * @param User user*/
	public static UserViewModel userToUserView(User user) {
		return new UserViewModel(
				user.getName(),
				user.getBirthdate(),
				new Role(user.getRole())
				);
	}
	/**
	 * convert userView to user
	 * @param UserView userView*/
	public static User userViewToUser(UserViewModel userView) {
		return new User(
				userView.getName(),
				userView.getBirthdate(),
				new Role(userView.getRole())
				);
	}
}
