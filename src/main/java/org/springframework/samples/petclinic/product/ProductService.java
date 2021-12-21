package org.springframework.samples.petclinic.product;

import java.util.List;


public class ProductService {
	private ProductRepository productRepository;
	
    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return this.productRepository.getProductsCheaperThan(price);
    }
    
    public List<ProductType> getAllProductTypes(){
    	return this.getAllProductTypes();
    }

    public ProductType getProductType(String typeName) {
        return this.productRepository.getProductType(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
