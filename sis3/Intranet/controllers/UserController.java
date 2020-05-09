package controllers;

import implementations.UserRepository;
import interfaces.IUserRepository;
import models.UserViewModel;
import services.UserServices;
import views.UserView;

public class UserController{
	
	private IUserRepository repository;
	
	public UserController() {
		this.repository = new UserRepository();
	}
	//GET
	public void index() {
		UserView.showUsers(UserServices
				.userSetToUserViewSet(this.repository.getUsers()));
	}
	//GET
	public void details(int id) {
		UserView.details(UserServices
				.userToUserView(this.repository.getUserById(id)));
	}
	//POST
	public void insertUser(UserViewModel userView) {
		repository.insertUser(UserServices
				.userViewToUser(userView));
	}
}
