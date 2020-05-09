package models;

import java.util.Date;

import entities.Role;

public class UserEditModel extends UserViewModel{

	private static final long serialVersionUID = 5137362355656358232L;
	private int id;
	
	public UserEditModel() {
		
	}
	public UserEditModel(String name, Date birthdate, Role role) {
		super(name, birthdate, role);
	}
	public UserEditModel(int id, String name, Date birthdate, Role role) {
		this(name, birthdate, role);
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
