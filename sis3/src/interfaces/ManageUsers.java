package interfaces;

import logic.*;

/**
 */
public interface ManageUsers {
    /**
     * @param newUser 
     * @return 
     */
    public boolean addUser(User newUser);

    /**
     * @param oldUser 
     * @return 
     */
    public boolean deleteUser(User oldUser);
}

