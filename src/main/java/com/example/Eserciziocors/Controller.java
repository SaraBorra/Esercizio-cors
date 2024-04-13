package com.example.Eserciziocors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/name")
    @CrossOrigin(origins = "http://localhost:8080")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/name")
    @CrossOrigin(origins = "http://localhost:8080")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
}

