package com.app.ecom;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata")); // Some wierd error for timezone is fixed here..Credits:ChatGpt
		SpringApplication.run(EcomApplication.class, args);
	}

}
