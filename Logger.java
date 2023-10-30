package case3;

public class Logger implements Repository {
	private Repository repository;

	public Logger(Repository productRepository) {
		this.repository=repository;
	}

	@Override
	public void add(String object) {
		System.out.println("logging - added an object");
		repository.add(object);
	}

	@Override
	public String read(int id) {
		System.out.println("logging - read an object");
		return repository.read(id);
	}

	@Override
	public void update(int id, String object) {
		System.out.println("logging - updated an object");
		repository.update(id, object);
	}

	@Override
	public void delete(int id) {
		System.out.println("logging - deleted an object");
		repository.delete(id);
	}

}
