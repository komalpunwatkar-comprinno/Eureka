package com.example.product_service.controller;
import com.example.product_service.model.Product;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/products")
public class ProductControllerV2 {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getProducts() {

        System.out.println("Product API V2");

        return service.getProducts();
    }
}
