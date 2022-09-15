package com.micro.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmploApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploApplication.class, args);
	}

}
