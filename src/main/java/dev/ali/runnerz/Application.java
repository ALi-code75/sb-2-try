package dev.ali.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		final Logger log = LoggerFactory.getLogger(Application.class);
		
		SpringApplication.run(Application.class, args);
		
		log.info("Application has started successfully");
		
		
	}

}
