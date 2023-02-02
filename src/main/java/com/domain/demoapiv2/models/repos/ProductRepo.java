package com.domain.demoapiv2.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.demoapiv2.models.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByNameContains(String name);

}
