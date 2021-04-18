package com.example.hrusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrUsersApplication.class, args);
	}

}
