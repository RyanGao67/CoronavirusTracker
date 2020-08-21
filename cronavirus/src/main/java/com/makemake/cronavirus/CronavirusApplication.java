package com.makemake.cronavirus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronavirusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronavirusApplication.class, args);
	}

}
