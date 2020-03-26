package edu.eci.arsw.coronavirus;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"edu.eci.arws.coronavirus"})
public class coronavirusAPIApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(coronavirusAPIApplication.class, args);

	}

}
