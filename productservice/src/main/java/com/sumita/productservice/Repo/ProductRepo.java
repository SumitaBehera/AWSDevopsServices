package com.sumita.productservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumita.productservice.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
