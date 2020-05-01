package implementations;

import java.util.HashSet;
import java.util.Set;

import entities.User;
import dal.DBContext;
import interfaces.IUserRepository;

public class UserRepository implements IUserRepository {
	
	private DBContext dbContext;
	
	public UserRepository(DBContext dbContext) {
		this.dbContext = dbContext;
	}
	@Override
	public Set<User> getUsers() {
		Set<User> users = dbContext.users;
		
		if(users == null) {
			return new HashSet<User>();
		}
		return users;
	}
	
	public DBContext getDbContext() {
		return dbContext;
	}
	public void setDbContext(DBContext dbContext) {
		this.dbContext = dbContext;
	}

}
