package com.example.customer_service.service;

import com.example.customer_service.model.Customer;
import com.example.customer_service.model.Product;
import com.example.customer_service.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<Product> getAllProducts() {

        String url = "http://PRODUCT-SERVICE/products";

        Product[] response =
                restTemplate.getForObject(
                        url,
                        Product[].class);

        return Arrays.asList(response);
    }
}