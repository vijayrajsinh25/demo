package com.codersfarm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DApplication {
    public String getMessage() {
    	return "hurrey !! deployment successfull";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DApplication.class, args);
	}

}
