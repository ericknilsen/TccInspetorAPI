package com.tcc.inspetor.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		//Altera a porta do servidor Web 
		System.setProperty("server.port", "8082");
		SpringApplication.run(Main.class, args);

	}

}
