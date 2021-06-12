package com.example.application.service;

import com.example.application.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    private Map<Integer, Customer> persist = new HashMap<>();   //mock db

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new Customer(id, name));
    }

    @Override
    public Customer getCustomer(int id) {
        return persist.get(id);
    }
}
