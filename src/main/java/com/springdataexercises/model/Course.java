package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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

    @ToString.Exclude
    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    public Course(String theme) {
        this.theme = theme;
    }
}