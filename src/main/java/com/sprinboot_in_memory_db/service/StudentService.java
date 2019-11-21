package com.sprinboot_in_memory_db.service;

import com.sprinboot_in_memory_db.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentService {

    @Autowired
    private StudentRepository repository;

    /**
     * Sample call:
     * http://localhost:8080/student/name?name=Ravi
     */
    @GetMapping("/name")
    public Student getStudent(String name) {
        return repository.findByName(name);
    }
}
