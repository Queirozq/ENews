package com.queiroz.ENews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ENewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ENewsApplication.class, args);
	}

}
