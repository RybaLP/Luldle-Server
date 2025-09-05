package com.Luldle.Luldle;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LuldleApplication {

	public static void main(String[] args) {

		System.setProperty("JWT_SECRET", System.getenv("JWT_SECRET"));
		System.setProperty("JWT_EXPIRATION", System.getenv("JWT_EXPIRATION"));
		System.setProperty("DB_URL", System.getenv("DB_URL"));
		System.setProperty("DB_PASSWORD", System.getenv("DB_PASSWORD"));
		System.setProperty("DB_USER", System.getenv("DB_USER"));

		SpringApplication.run(LuldleApplication.class, args);
	}
}