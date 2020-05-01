package entities;

import java.util.List;

public class Role {
	public String roleName;
	public List<User> users;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
}
