package com.learn.Ecommerce.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.repository.ProductRepository;

@Projection(name = "category",types = {Product.class})
public interface ProductProjection {
	
	String getProductName();
	String getProductprice();
	@Value("#{target.category?.categoryName}")
	String getCategory();

}
