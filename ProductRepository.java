package case3;

public class ProductRepository implements Repository {

	@Override
	public void add(String object) {
		System.out.println("Added something");
	}

	@Override
	public String read(int id) {
		return "Read something";
	}

	@Override
	public void update(int id, String object) {
		System.out.println("Updated something");
	}

	@Override
	public void delete(int id) {
		System.out.println("Deleted something");
	}

}
