package com.njtechie.springbootazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureDemoApplication.class, args);
    }

    @GetMapping("/greet")
    public String greet() {
        return "Congratulations Nirav !! You have successfully deployed first spring boot app to Azure.";
    }
}
