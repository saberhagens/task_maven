package com.example.application.service;

import com.example.application.model.Customer;

public interface CustomerService {
    void addCustomer(int id, String name);

    Customer getCustomer(int id);
}
