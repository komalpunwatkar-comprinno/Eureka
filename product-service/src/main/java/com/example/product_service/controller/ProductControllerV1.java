package com.example.product_service.controller;

import com.example.product_service.model.Product;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductControllerV1 {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(
            @RequestBody Product product) {

        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }
}