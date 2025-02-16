package com.example.war_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController	
public class WarFileApplication {

	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World from WAR";
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(WarFileApplication.class, args);
	}

}
