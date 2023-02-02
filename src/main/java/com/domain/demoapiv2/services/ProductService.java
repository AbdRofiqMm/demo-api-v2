package com.domain.demoapiv2.services;

import java.util.List;

import com.domain.demoapiv2.models.entities.Product;
import com.domain.demoapiv2.models.entities.Supplier;

public interface ProductService {

    public Product save(Product product);

    public Product findOne(Long id);

    public Iterable<Product> findAll();

    public void removeOne(Long id);

    public List<Product> findByName(String name);

    public void addSupplier(Supplier supplier, Long productId);

}
