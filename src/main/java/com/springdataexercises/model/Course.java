package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "course", schema = "spring_data")
@Data
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String theme;

    // @ToString.Exclude
    @ManyToMany(mappedBy = "courses")
    private Set<Teacher> teachers;

    public Course(String theme) {
        this.theme = theme;
    }
}