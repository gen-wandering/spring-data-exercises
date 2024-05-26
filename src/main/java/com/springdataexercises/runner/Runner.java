package com.springdataexercises.runner;

import com.springdataexercises.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final StudentIdCardRepository studentIdCardRepository;

    @Override
    public void run(String... args) {
        studentRepository.findAll().forEach(System.out::println);
        System.out.println();
        studentIdCardRepository.findAll().forEach(System.out::println);
    }
}