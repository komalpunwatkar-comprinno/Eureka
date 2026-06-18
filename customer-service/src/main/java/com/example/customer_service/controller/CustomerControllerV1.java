package com.example.customer_service.controller;

import com.example.customer_service.model.CustomerV1;
import com.example.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerControllerV1 {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerV1> getCustomers() {

        return customerService.getCustomers()
                .stream()
                .map(c -> new CustomerV1(
                        c.getId(),
                        c.getName(),
                        c.getEmail()))
                .toList();
    }
}