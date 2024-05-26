package com.springdataexercises.runner;

import com.springdataexercises.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    @Override
    @Transactional(readOnly = true)
    public void run(String... args) {
        courseRepository.findAll().forEach(System.out::println);
        //teacherRepository.findAll().forEach(System.out::println);
    }
}