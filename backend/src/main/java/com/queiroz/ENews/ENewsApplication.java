package com.queiroz.ENews;

import com.queiroz.ENews.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ENewsApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;


	public static void main(String[] args) {
		SpringApplication.run(ENewsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Program Files (x86)\\print.jpg");
	}
}
