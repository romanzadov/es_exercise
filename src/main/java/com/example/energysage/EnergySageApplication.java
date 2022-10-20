package com.example.energysage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EnergySageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnergySageApplication.class, args);
    }

}
