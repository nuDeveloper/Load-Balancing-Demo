package com.order.details.orderdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderdetailsApplication.class, args);
	}

}
