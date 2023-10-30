package case3;

public class MainLogging {

	public static void main(String[] args) {
		
		Repository productRepository= new ProductRepository();
		Repository logRepository= new Logger(productRepository);
		logRepository.add("Water bottle");
		String product=logRepository.read(1);
		logRepository.add("Water bottle2");
		String product2=logRepository.read(2);
		logRepository.update(1, "Watter-bottle");
		logRepository.delete(2);
	}
}
