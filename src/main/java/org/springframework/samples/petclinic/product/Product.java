package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Constraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.samples.petclinic.owner.Owner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "products")
public class Product {
	@Column(name="id")
	@Id
    Integer id;
	
	@Column(name = "name")
	@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
	@NotEmpty
    String name;
	
	@Column(name = "price")
	@Min(value = 0, message = "Price should not be less than 1")
	@NotEmpty
    double price;
	
	@ManyToOne
	@JoinColumn(name = "productType")
    private ProductType productType;	
}
