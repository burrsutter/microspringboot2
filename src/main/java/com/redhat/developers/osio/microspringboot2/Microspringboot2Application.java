package com.redhat.developers.osio.microspringboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class Microspringboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microspringboot2Application.class, args);
	}
}
