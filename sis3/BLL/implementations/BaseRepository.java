package implementations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import interfaces.IBaseRepository;

public class BaseRepository implements IBaseRepository, Serializable{
	
	private static final long serialVersionUID = 3147332085119028745L;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private FileInputStream fis;
	private ObjectInputStream ois;
	
	public Object extractObject(String path){
		if(path != null && new File(path).exists() && new File(path).length() != 0) {
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				try {
					return ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				finally {
					fis.close();
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public boolean saveObject(Object o, String path) {
		if(path != null) {
			try {
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(o);
				oos.flush();
				oos.close();
				return true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
