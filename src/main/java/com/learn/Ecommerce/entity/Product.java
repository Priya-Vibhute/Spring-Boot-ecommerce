package com.learn.Ecommerce.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name = "product_details")   will help to change table name
//@Table(name = "table-name")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(nullable = false)
	private String productName;
	@Column(name = "description",nullable = false)
	private String productDescription;
	@Column(nullable = false)
	private int productprice;
	@ManyToOne
	@Cascade(CascadeType.ALL)
	private Category category;

}
