package com.example.energysage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    AddressRepository addressRepository;

    public Customer create(CustomerForm form) {
        validate(form);
        Address address = addressRepository.save(new Address(form));

        Customer customer = new Customer(form, address);
        return repository.save(customer);
    }

    public Optional<Customer> get(String id) {
        return repository.findById(id);
    }

    private void validate(CustomerForm form) {
        // TODO check the postal_code, email
    }
}
