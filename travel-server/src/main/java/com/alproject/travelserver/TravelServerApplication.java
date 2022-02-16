package com.alproject.travelserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TravelServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelServerApplication.class, args);
    }

}
