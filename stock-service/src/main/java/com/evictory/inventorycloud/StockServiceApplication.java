package com.evictory.inventorycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableResourceServer
@EnableEurekaClient
public class StockServiceApplication {

	public static void main(String[] args)         {
		SpringApplication.run(StockServiceApplication.class, args);
	}

}
