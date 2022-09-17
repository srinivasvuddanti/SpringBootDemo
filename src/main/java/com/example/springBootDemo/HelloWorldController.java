package com.example.springBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWorldController {
	
	//GET http method 
	//PUT
	//POST
	//DELETE 
	//http://localhost:8081/hello-world
	
	//@GetMapping(value="/hello-world", produces="application/json")
	@GetMapping("/hello-world")
	public Student getMessage() {
		//return "hello world!";
        return new Student("prameela","vuddanti");
	}
	
	@GetMapping("/Test")
	public String display() {
		return "Test message";
	}
}
