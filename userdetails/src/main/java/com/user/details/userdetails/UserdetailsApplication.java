package com.user.details.userdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdetailsApplication.class, args);
	}

}
