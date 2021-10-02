package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
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
