package com.example.energysage;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerForm {
    String first_name;
    String last_name;
    String email;
    String electricity_usage_kwh;
    Boolean old_roof;
    String street;
    String city;
    String state_code;
    String postal_code;
}
