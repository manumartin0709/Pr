package com.iesjandula.PrUD3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PrUd3Application {

	public static void main(String[] args) {
		SpringApplication.run(PrUd3Application.class, args);
	}

}
