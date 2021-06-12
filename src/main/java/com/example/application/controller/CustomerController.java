package com.example.application.controller;

import com.example.application.model.Customer;
import com.example.application.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {
    //@Autowired
    private CustomerService customerService;

   /* public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }*/

    @PostMapping
    public void addCustomer(@RequestParam int id, @RequestParam String name) {
        customerService.addCustomer(id, name);
    }

    @GetMapping
    public Customer getCustomer (@RequestParam int id) {
        return customerService.getCustomer(id);
    }
}
