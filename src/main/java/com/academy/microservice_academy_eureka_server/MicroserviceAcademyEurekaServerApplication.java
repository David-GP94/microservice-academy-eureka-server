package com.academy.microservice_academy_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceAcademyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAcademyEurekaServerApplication.class, args);
	}

}
