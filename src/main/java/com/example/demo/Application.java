package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	private static ConfigurableApplicationContext run;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//changes for HIS-134
		
		run.close();
	}

}
