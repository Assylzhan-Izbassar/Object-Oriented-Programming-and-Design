package implementations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import entities.User;
import dal.DBContext;
import interfaces.IUserRepository;

public class UserRepository implements IUserRepository, Serializable{
	
	private DBContext dbContext;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private String dbPath = "DB/users.txt";
	
	public UserRepository(){
		this.dbContext = new DBContext();
	}
	@Override
	public Set<User> getUsers() throws IOException {
		fis = new FileInputStream(this.dbPath);
		ois = new ObjectInputStream(fis);
		Set<User> users = null;
		try {
			users = (Set<User>)ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		
		fos =  new FileOutputStream(this.dbPath);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(users);
		oos.flush();
		oos.close();
	}
	@Override
	public User getUserById(int id) throws IOException {
		
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
	public boolean removeUser(int id) throws IOException {
		User user = this.getUserById(id);
		
		if(user != null) {
			dbContext.users.remove(user);
			this.save();
			return true;
		}
		return false;
	}

}
