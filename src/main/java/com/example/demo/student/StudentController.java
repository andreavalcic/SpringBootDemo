package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path =  "api/v1/student")
public class StudentController {
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
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
