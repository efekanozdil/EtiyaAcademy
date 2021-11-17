package northwind;

import northwind.business.abstracts.CategoryService;
import northwind.business.abstracts.EmployeeService;
import northwind.business.abstracts.ProductService;
import northwind.business.concretes.CategoryManager;
import northwind.business.concretes.EmployeeManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.CategoryDao;
import northwind.dataAccess.concretes.EmployeeDao;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Category;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1,1,"Armut",10));
		productService.add(new Product(1,1,"Elma",20));
		productService.add(new Product(1,1,"Karpuz",30));
		productService.add(new Product(1,1,"İncir",40));
		productService.add(new Product(1,1,"kiraz",40));
		productService.add(new Product(1,1,"çilek",40));
		productService.add(new Product(1,8,"ayva",-5));
		
		for (Product product : productService.getAll()) {
			System.out.println(product.getProductName());	
		}
		
		System.out.println("---------------------------------");
		CategoryService categoryService = new CategoryManager(new CategoryDao());
		categoryService.add(new Category(1,"İçecek"));
		categoryService.add(new Category(2,"Temizlik"));
		categoryService.add(new Category(3,"Elektronik"));
		categoryService.add(new Category(4,"Beyaz Eşya"));
		categoryService.add(new Category(5,"Mobilya"));
		
		for(Category category : categoryService.getAll()) {
			System.out.println(category.getCategoryName());
		}
		
		System.out.println("---------------------------------");
		
		EmployeeService employeeService= new EmployeeManager(new EmployeeDao());
		employeeService.add(new Employee(1,"berkay","yıldız","İstanbul"));
		employeeService.add(new Employee(1,"ömer","ingeç","Ankara"));
		
		for (Employee employee : employeeService.getAll()) {
			System.out.println(employee.getCity());
		}
		
		
		

	}

}
