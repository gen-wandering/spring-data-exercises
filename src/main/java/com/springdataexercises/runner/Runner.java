package com.springdataexercises.runner;

import com.springdataexercises.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) {
        studentRepository.getStudentsWithBooks().forEach(System.out::println);
        System.out.println();
        bookRepository.findAll().forEach(System.out::println);
    }
}