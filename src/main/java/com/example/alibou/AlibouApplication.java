package com.example.alibou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


@SpringBootApplication
public class AlibouApplication {

	public static void main(String[] args) {

	var app = new SpringApplication(AlibouApplication.class);
	app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
	var ctx = 	app.run( args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);

		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getCustomProperties());
		System.out.println(myFirstService.getCustomPropertiesInt());

	}


}
 
