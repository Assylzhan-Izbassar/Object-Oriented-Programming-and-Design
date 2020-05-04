package interfaces;

import java.util.Set;
import entities.User;

public interface IUserRepository{
	
	Set<User> getUsers();
	User getUserById(int id);
	boolean insertUser(User newUser);
	boolean removeUser(int id);
	boolean updateUser(int id, User newUser);
	boolean save();
}
