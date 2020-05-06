package controllers;

import implementations.UserRepository;
import interfaces.IUserRepository;
import services.UserServices;
import views.UserView;

public class UserController{
	
	private IUserRepository repository;
	
	public UserController() {
		this.repository = new UserRepository();
	}
	
	public void index() {
		UserView.showUsers(UserServices
				.userSetToUserViewSet(this.repository.getUsers()));
	}
	
	public void details(int id) {
		UserView.details(UserServices
				.userToUserView(this.repository.getUserById(id)));
	}
}
