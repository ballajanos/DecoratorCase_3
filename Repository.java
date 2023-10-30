package case3;

public interface Repository {
	void add(String object);
	String read(int id);
	void update(int id, String object);
	void delete(int id);
}
