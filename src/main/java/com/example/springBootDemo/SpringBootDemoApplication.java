package com.example.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);  
		
		System.out.println("hello world ..........");
		
		Employee e = new Employee();
		e.setEId(1);
		e.setEName("koundinya");
		e.setEAddress("Newyork");
		
		System.out.println(e.getEId())kjlkjk;
		System.out.println(e.getEName());
		System.out.println(e.getEAddress());
	}

}
