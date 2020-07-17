package com.ds2.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//TODO-1 uncomment the below to disable spring application start up information default log messages

	/*new SpringApplicationBuilder(Application.class)
				.logStartupInfo(false)
				.run(args);*/

}
