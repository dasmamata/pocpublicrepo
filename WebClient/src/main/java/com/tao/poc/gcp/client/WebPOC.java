package com.tao.poc.gcp.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = {"com.tao.poc.gcp"})
@EnableAutoConfiguration
public class WebPOC {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplicationBuilder(WebPOC.class).application();
		app.run(args);
	}
}	
