package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productTypes")
public class ProductType {
	@Column(name="id")
	@Id
    Integer id;
	
	@Column(name="name", unique=true)
	@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
	@NotEmpty
    String name;
}
