package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enrollment", schema = "spring_data")
public class Enrollment {

    @EmbeddedId
    private EnrollmentId id;

    @Column(name = "enrollment_date")
    private LocalDateTime date;

    @ToString.Exclude
    @MapsId(value = "studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @MapsId(value = "courseId")
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}