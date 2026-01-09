
package dev.ali.runnerz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}	
	
//	@Bean
//	CommandLineRunner runner(RunRepository runRepository) {
//	    return args -> {
//	        Run run = new Run(
//	            1,
//	            "First Run",
//	            LocalDateTime.of(2021, 1, 1, 6, 0),
//	            LocalDateTime.of(2021, 1, 1, 7, 0),
//	            5,
//	            Location.OUTDOOR
//	        );
//	        runRepository.create(run);
//
//	        log.info("Run: "+ run);
//	    };
//	}
	
	

}
