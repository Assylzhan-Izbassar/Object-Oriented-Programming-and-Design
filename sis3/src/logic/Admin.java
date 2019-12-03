package logic;

import java.util.Vector;

import interfaces.ManageUsers;

/**
 */
public class Admin extends User implements ManageUsers {
    /**
     */
	public Vector<User> users;
    
    public Admin(Vector<User> users)
    {
    	this.users = users;
    }

    /**
     */
    public void seeLogFiles() {
    }

    /**
     * @return 
     */
    public String toString() {
        return null;
    }

    /**
     * @param newUser 
     * @return 
     */
    public boolean addUser(User newUser) {
        return false;
    }

    /**
     * @param oldUser 
     * @return 
     */
    public boolean deleteUser(User oldUser) {
        return false;
    }
    
    public Vector<User> getUsers()
    {
    	return users;
    }
}

