package com.example.MicroService4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroService4Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService4Application.class, args);
	}

}
