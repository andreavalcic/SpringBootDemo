package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
/*
	@GetMapping
	public String Hello() {
		return "Hello Anja";
	}

	@GetMapping
	public List<String> Hello() {
		return List.of("Hello", "Anja");  // return JSON ["Hello", "Anja"]
	}
*/
	@GetMapping
	public List<Student> Hello() {
		return List.of(
				new Student(
						1L, // bc is Long
						"Andrea",
						"andrea@gmail.com",
						LocalDate.of(1997, Month.OCTOBER, 17),
						23
				)
		);
	}

}
