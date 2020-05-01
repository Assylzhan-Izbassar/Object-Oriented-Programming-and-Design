package interfaces;

import java.util.Set;
import entities.User;

public interface IUserRepository {
	Set<User> getUsers();
}
