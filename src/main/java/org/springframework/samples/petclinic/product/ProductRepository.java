package org.springframework.samples.petclinic.product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.owner.Owner;



public interface ProductRepository extends CrudRepository<Product, Integer>{
	@Query("SELECT * FROM Product")
	public List<Product> findAll();
	
	@Query("SELECT product.productType FROM Product product")
	public List<ProductType> findAllProductTypes();
	
	@Query("SELECT product.productType FROM Product product WHERE product.productType LIKE :productType%")
	public ProductType getProductType(@Param("productType") String productType);
	
	@Query("SELECT product FROM Product product WHERE product.price <= %price")
	public List<Product> getProductsCheaperThan(@Param("price") Double price);
	
    Optional<Product> findById(int id);
    
    Product findByName(String name) throws DataAccessException;
    
    //void save(Product p) throws DataAccessException;
}
