package com.routinecart.component.parcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ParcelApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParcelApplication.class, args);
	}
}
