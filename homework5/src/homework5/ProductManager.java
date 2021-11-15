package homework5;

public class ProductManager implements ProductService{

	private LoggerService[] loggerService;
	
	public ProductManager(LoggerService[] loggerService) {
		this.loggerService = loggerService;
	}

	@Override
	public void save(Product product) {
		
		System.out.println("Ürün eklendi "+product.getName());
		for (LoggerService loggerService2 : loggerService) {
			loggerService2.log();
		}
		
	}

}
