package com.springdataexercises.repository;

import com.springdataexercises.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "SELECT s FROM Student s LEFT JOIN FETCH s.books")
    List<Student> getStudentsWithBooks();
}