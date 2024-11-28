package com.learn.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.projections.ProductProjection;
import com.learn.Ecommerce.projections.ProductProjection2;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Integer> {

}