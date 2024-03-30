package com.johnny.spring.demo.rest;

import com.johnny.spring.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("students")
    public List<Student> getStudents(){
        return List.of(
                new Student("Poornima", "Patel"),
                new Student("Mario", "Rossi"),
                new Student("Mary", "Smith"));
    }
}
