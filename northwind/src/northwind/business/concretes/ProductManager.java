package northwind.business.concretes;

import java.util.List;

import northwind.business.abstracts.ProductService;
import northwind.core.utilities.results.DataResult;
import northwind.core.utilities.results.ErrorResult;
import northwind.core.utilities.results.Result;
import northwind.core.utilities.results.SuccessDataResult;
import northwind.core.utilities.results.SuccessResult;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public DataResult<List<Product>> getAll() {

		return new SuccessDataResult<List<Product>>(this.productRepository.getAll());
	}

	@Override
	public Result add(Product product) {

		if(productNameChecker(product.getProductName()).isSuccess()){
			this.productRepository.add(product);
			return new SuccessResult("Ürün eklendi");
		}
		else {
			return new ErrorResult("Ürün eklenemedi");
		}
		
	}

	private Result productNameChecker(String productName) {

		for (Product product : productRepository.getAll()) {
			if (productName == product.getProductName()) {
				this.productRepository.add(product);
				return new ErrorResult("Ürün ismi tekrar edemez.");
			}


		}
		return new SuccessResult();
	}

//	private boolean categoryChecker(Product product) {
//		int count = 0;
//
//		for (Product p1 : productRepository.getAll()) {
//			if (p1.getCategoryId() == product.getCategoryId()) {
//				count++;
//			}
//		}
//		if (count < 5) {
//			return false;
//		}
//		return true;
//
//	}
//
//	private boolean unitPriceChecker(Product product) {
//
//		if (product.getUnitPrice() < 0) {
//			return true;
//		}
//
//		return false;
//
//	}
//
//	private boolean categoryId3Checker(Product product) {
//		if (product.getCategoryId() == 3) {
//			if (product.getUnitPrice() < 10) {
//				return true;
//			}
//		}
//		return false;
//	}

}
