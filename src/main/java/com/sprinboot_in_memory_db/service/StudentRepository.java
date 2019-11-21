package com.sprinboot_in_memory_db.service;

import com.sprinboot_in_memory_db.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);
}
