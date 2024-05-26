package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "book", schema = "spring_data")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_name")
    private String bookName;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "student_id") // optional
    private Student student;

    public Book(Student student, String bookName) {
        this.student = student;
        this.bookName = bookName;
    }
}