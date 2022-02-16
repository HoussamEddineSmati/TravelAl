package com.travel.VoyageGest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VoyageGestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoyageGestApplication.class, args);
	}

}
