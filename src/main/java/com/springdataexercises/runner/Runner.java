package com.springdataexercises.runner;

import com.springdataexercises.model.Book;
import com.springdataexercises.model.Student;
import com.springdataexercises.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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

    private void saveBookAndStudent() {
        Student student1 = new Student("1", "1", "1", 1);
        Student student2 = new Student("2", "2", "2", 2);

        Book book1 = new Book("FirsBook");
        Book book2 = new Book("SecondBook");

        student1.setBooks(List.of(book1, book2));

        bookRepository.save(book1);
        bookRepository.save(book2);

        studentRepository.save(student1);
        studentRepository.save(student2);
    }
}