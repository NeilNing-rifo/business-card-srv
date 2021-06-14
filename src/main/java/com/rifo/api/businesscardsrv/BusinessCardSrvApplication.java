package com.rifo.api.businesscardsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BusinessCardSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessCardSrvApplication.class, args);
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello, I am Business Card API!";
    }
}
