package com.travel.ConfigServtravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServtravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServtravelApplication.class, args);
	}

}
