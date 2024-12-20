package com.petstagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class PetstagramApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstagramApplication.class, args);
	}

}