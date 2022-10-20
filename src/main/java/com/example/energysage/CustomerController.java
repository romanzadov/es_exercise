package com.example.energysage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{customerId}")
    public Customer get(@PathVariable("customerId") String customerId) {

        return customerService.get(customerId).get();
    }

    @PatchMapping("/customer/{customerId}")
    public Customer patch(@PathVariable("customerId") String customerId) {
        return new Customer();
    }

    @PostMapping("/customer")
    public Customer create(CustomerForm form) {
        return customerService.create(form);
    }
}
