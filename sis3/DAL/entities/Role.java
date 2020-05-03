package entities;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable  {
	public String roleName;
	public List<User> users;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	public String toString() {
		return this.roleName;
	}
}
