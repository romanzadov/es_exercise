package com.example.energysage;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Column
    String street;

    @Column
    String city;

    @Column
    String stateCode;

    @Column
    String postalCode;

    Address(CustomerForm form) {
        street = form.getStreet();
        city = form.getCity();
        stateCode = form.getState_code();
        postalCode = form.getPostal_code();
    }
}
