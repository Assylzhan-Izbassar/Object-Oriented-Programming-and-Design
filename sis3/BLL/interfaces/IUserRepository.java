package interfaces;

import java.io.IOException;
import java.util.Set;
import entities.User;

public interface IUserRepository {
	Set<User> getUsers() throws IOException;
	User getUserById(int id) throws IOException;
	void save() throws IOException;
	boolean addUser(User newUser) throws IOException;
	boolean removeUser(int id) throws IOException;
}
