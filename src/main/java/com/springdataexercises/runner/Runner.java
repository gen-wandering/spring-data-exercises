package com.springdataexercises.runner;

import com.springdataexercises.model.Book;
import com.springdataexercises.model.Student;
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

        saveBookAndStudent();

        studentRepository.findAll().forEach(System.out::println);
        System.out.println();
        bookRepository.findAll().forEach(System.out::println);
    }

    private void saveBookAndStudent() {
        Student student1 = new Student("1", "1", "1", 1);
        Student student2 = new Student("2", "2", "2", 2);

        Book book1 = new Book(student1, "FirsBook");
        Book book2 = new Book(student1, "SecondBook");

        studentRepository.save(student1);
        studentRepository.save(student2);

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}