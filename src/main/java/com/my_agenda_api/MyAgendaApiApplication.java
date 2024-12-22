package com.my_agenda_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAgendaApiApplication {

	public static void main(String[] args) {
		System.out.println("Initializing...");
		SpringApplication.run(MyAgendaApiApplication.class, args);
		System.out.println("Initializing finished.");
	}

}
