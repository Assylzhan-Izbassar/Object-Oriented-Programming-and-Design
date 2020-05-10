package implementations;

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
		if(getUsers() != null) {
			this.dbContext.users = getUsers();
		}
	}
	@Override
	@SuppressWarnings("unchecked")
	public Set<User> getUsers() {
		return (Set<User>)super.extractObject(this.dbPath);
	}
	
	public DBContext getDbContext() {
		return dbContext;
	}
	
	public boolean save(){
		return super.saveObject(dbContext.users, this.dbPath);
	}
	@Override
	public User getUserById(int id) {
		
		Set<User> users = this.getUsers();
		
		if((id-1) < users.size()){
			for (User user : users) {
				if(user.getId() == id) {
					return user;
				}
			}
		}
		return null;
	}
	@Override
	public boolean insertUser(User newUser){
		if(newUser != null) {
			if(this.getUsers() == null) {
				newUser.setId(1);
			}
			else {
				newUser.setId(this.getUsers().size()+1);
			}
			dbContext.users.add(newUser);
			this.save();
			return true;
		}
		return false;
	}
	@Override
	public boolean removeUser(int id){
		User user = this.getUserById(id);
		
		if(user != null) {
			dbContext.users.remove(user);
			this.save();
			return true;
		}
		return false;
	}
	@Override
	public boolean updateUser(int id, User newUser) {
		this.removeUser(id);
		newUser.setId(id);
		return this.insertUser(newUser);
	}

}
