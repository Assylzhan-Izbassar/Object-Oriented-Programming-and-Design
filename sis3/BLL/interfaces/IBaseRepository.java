package interfaces;

public interface IBaseRepository {
	Object extractObject(String path);
	boolean saveObject(Object o,String path);
}
