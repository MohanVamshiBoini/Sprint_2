package com.cap.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeleteCentreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteCentreApplication.class, args);
	}

}
