package implementations;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

import entities.User;
import dal.DBContext;
import interfaces.IUserRepository;

public class UserRepository extends BaseRepository implements IUserRepository, Serializable{
	
	private static final long serialVersionUID = -1309997129220173168L;
	private DBContext dbContext;
	private String dbPath = "DB/users.txt";
	
	public UserRepository(){
		this.dbContext = new DBContext();
	}
	@Override
	public Set<User> getUsers() {

		@SuppressWarnings("unchecked")
		Set<User> users = (Set<User>)extractObject(this.dbPath);
		return users;
	}
	
	public DBContext getDbContext() {
		return dbContext;
	}
	public void setDbContext(DBContext dbContext) {
		this.dbContext = dbContext;
	}
	
	public void save() throws IOException {
		Set<User> users = dbContext.users;
		if(super.saveObject(users, this.dbPath)) {
			super.saveObject(users, this.dbPath);
		}
	}
	@Override
	public User getUserById(int id) {
		
		Set<User> users = this.getUsers();
		
		if((id-1) > users.size())
			return null;
		
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	@Override
	public boolean addUser(User newUser) throws IOException {
		if(newUser != null) {
			dbContext.users.add(newUser);
			this.save();
			return true;
		}
		return false;
	}
	@Override
	public boolean removeUser(int id) throws IOException{
		User user = this.getUserById(id);
		
		if(user != null) {
			dbContext.users.remove(user);
			this.save();
			return true;
		}
		return false;
	}

}
