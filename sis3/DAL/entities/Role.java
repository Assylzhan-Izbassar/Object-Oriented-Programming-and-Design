package entities;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable  {

	private static final long serialVersionUID = 1L;
	private String roleName;
	public List<User> users;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	public String toString() {
		return this.roleName;
	}
	
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
