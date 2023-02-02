package com.domain.demoapiv2.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.demoapiv2.models.entities.Product;
import com.domain.demoapiv2.models.entities.Supplier;
import com.domain.demoapiv2.models.repos.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product findOne(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void removeOne(Long id) {
        productRepo.deleteById(id);

    }

    @Override
    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }

    @Override
    public void addSupplier(Supplier supplier, Long productId) {
        Product product = findOne(productId);
        if (product == null) {
            throw new RuntimeException("Product with ID:" + productId + " not found");
        }
        product.getSuppliers().add(supplier);
        save(product);
    }

}
