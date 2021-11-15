package homework5;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("aa");
		p1.setPrice(12.5);
		p1.setQuantity(10);
		
		LoggerService[] ps = {new FileLogger(), new DatabaseLogger(),new ConsoleLogger()};
		
		ProductService productService = new ProductManager(ps);
		productService.save(p1);

	}

}
