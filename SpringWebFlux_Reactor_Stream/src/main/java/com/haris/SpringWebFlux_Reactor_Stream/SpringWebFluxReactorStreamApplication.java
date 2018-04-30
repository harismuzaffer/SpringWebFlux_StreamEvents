package com.haris.SpringWebFlux_Reactor_Stream;

import java.net.URISyntaxException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebFluxReactorStreamApplication {

	public static void main(String[] args) throws URISyntaxException {
		
		SpringApplication.run(SpringWebFluxReactorStreamApplication.class, args);
		
		WebClientClass webclient = new WebClientClass();
		webclient.getResult();
	}
}
