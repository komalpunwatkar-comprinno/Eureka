package com.example.product_service.service;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }
}
