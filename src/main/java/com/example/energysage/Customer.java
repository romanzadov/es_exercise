package com.example.energysage;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Column
    String firstName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    Address propertyAddress;

    public Customer(CustomerForm form, Address address) {
        firstName = form.getFirst_name();
        propertyAddress = address;
    }

    public Customer() {

    }
}
