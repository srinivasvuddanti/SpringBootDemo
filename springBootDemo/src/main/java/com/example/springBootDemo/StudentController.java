/**
 * 
 */
package com.example.springBootDemo;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.tools.javac.util.List;

/**
 * @author srinivas
 *
 */
@RestController
public class StudentController {
	
	//http:localhost:8081/student
	
	@GetMapping(value="/student", produces = "application/xml")
	public Student getStudent() {
		return new Student("srinivas", "vuddanti");
	}
	
	@GetMapping(value="/students", produces="application/json")
	public ArrayList<Student> getStudents(){
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(new Student("prameela","vuddanti"));
		stu.add(new Student("ramesh", "vadodara"));
		stu.add(new Student("naresh", "vadodara"));
		return stu;
	}
	
	//PATH variable 
	//http:localhost:8081/student/srinivas/vuddanti
	@GetMapping(value="/student/{firstName}/{lastName}", produces="application/json")
	public Student studentPathDetails(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	//@RequestParam 
	//http://localhost:8081/student/query?firstName=Srinivas&lastName=Vuddanti
	@GetMapping("/student/query")
	public Student getStudentQuery(
			@RequestParam(name = "firstName") String firstName, 
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
