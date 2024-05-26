package com.springdataexercises.repository;

import com.springdataexercises.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "SELECT s FROM Student s LEFT JOIN FETCH s.enrollments WHERE s.id = :id")
    Student getStudentWithEnrollments(@Param(value = "id") int id);
}
