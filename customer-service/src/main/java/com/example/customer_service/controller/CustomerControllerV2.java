package com.example.customer_service.controller;

import com.example.customer_service.model.CustomerV2;
import com.example.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/customers")
public class CustomerControllerV2 {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerV2> getCustomers() {

        return customerService.getCustomers()
                .stream()
                .map(c -> new CustomerV2(
                        c.getId(),
                        c.getName(),
                        c.getEmail(),
                        c.getPhoneNumber()))
                .toList();
    }
}