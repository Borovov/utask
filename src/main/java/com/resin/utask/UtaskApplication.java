package com.resin.utask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtaskApplication.class, args);
	}

}
