package com.tao.poc.gcp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.tao.poc.gcp"})
@EnableCaching
public class GCPSprngDatabasePOC1 {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplicationBuilder(GCPSprngDatabasePOC1.class).application();
		app.run(args);
	}
}	
