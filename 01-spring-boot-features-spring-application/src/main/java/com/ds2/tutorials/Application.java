package com.ds2.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	// You can disable those three log messages by configuring your SpringApplication not to log startup info:

	/*public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
				.logStartupInfo(false)
				.run(args);
	}*/




}
