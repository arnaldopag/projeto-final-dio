package me.dio.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public String port = System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
