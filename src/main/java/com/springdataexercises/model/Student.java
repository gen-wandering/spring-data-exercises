package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students", schema = "spring_data")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column
    private String email;

    @Column
    private int age;

    public Student(String name, String surname,
                   String email, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }
}