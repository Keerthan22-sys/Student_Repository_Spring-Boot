package com.example.thymeleaf.repository;

import com.example.thymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Task 5: write your code here
public interface StudentRepository extends JpaRepository<Student, String> {

}
