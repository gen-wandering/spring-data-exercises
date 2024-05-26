package com.springdataexercises.runner;

import com.springdataexercises.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final EnrollmentRepository enrollmentRepository;

    @Override
    @Transactional(readOnly = true)
    public void run(String... args) {
        studentRepository.findAll().forEach(System.out::println);
        // enrollmentRepository.findAll().forEach(System.out::println);
    }
}