package services;

import java.util.HashSet;
import java.util.Set;

import entities.Role;
import entities.User;
import models.UserEditModel;
import models.UserViewModel;

public class UserServices {
	/**
	 * convert set of users into set to userViews
	 * @param Set<User> users*/
	public static Set<UserViewModel> userSetToUserViewSet(Set<User> users){
		
		if(users == null)
			return null;
		
		Set<UserViewModel> userView = new HashSet<UserViewModel>();
		
		for(User user : users) {
			userView.add(UserServices.userToUserView(user));
		}
		return userView;
	}
	/**
	 * convert set of users into set to userViews
	 * @param Set<User> users*/
	public static Set<UserEditModel> userSetToUserEditViewSet(Set<User> users){
		
		if(users == null)
			return null;
		
		Set<UserEditModel> userView = new HashSet<UserEditModel>();
		
		for(User user : users) {
			userView.add(UserServices.userToUserEditView(user));
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
		User user = new User(
				userView.getName(),
				userView.getBirthdate(),
				new Role(userView.getRole())
				);
		return user;
	}
	/**
	 * convert user to userEditView
	 * @param User user*/
	public static UserEditModel userToUserEditView(User user) {
		return new UserEditModel(
				user.getId(),
				user.getName(),
				user.getBirthdate(),
				new Role(user.getRole())
				);
	}
	/**
	 * convert userEditModel to user
	 * @param User user*/
	public static User userEditModelToUser(UserEditModel userView) {
		return new User(
				userView.getName(),
				userView.getBirthdate(),
				new Role(userView.getRole())
				);
	}
	/**
	 * convert userEditModel to userView
	 * @param User user*/
	public static UserViewModel userEditModelToUserView(UserEditModel user) {
		return new UserViewModel(
				user.getName(),
				user.getBirthdate(),
				new Role(user.getRole())
				);
	}
	/**
	 * convert userView to UserEdit
	 * @param User user*/
	public static UserEditModel userViewModelToUserEditView(UserViewModel user) {
		return new UserEditModel(
				user.getName(),
				user.getBirthdate(),
				new Role(user.getRole())
				);
	}
	
}
