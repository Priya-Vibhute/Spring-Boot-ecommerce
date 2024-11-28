package com.learn.Ecommerce.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.repository.ProductRepository;

@Projection(name = "category2",types = {Product.class})
public interface ProductProjection2 {
	
	String getProductName();
	String getProductprice();
	
}
