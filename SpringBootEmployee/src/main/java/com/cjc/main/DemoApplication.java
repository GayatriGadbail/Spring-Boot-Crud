package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("This is a Employee");
		SpringApplication.run(DemoApplication.class, args);
	}

}
