package com.example.war_file;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WarFileController {

    @GetMapping
    public String sayHello() {
        return "Hello, World from Spring Boot!";
    }
}
