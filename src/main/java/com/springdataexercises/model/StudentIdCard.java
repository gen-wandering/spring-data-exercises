package com.springdataexercises.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "student_id_card", schema = "spring_data")
@Data
@NoArgsConstructor
public class StudentIdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_number")
    private String cardNumber;

    @ToString.Exclude
    @OneToOne
    @JoinColumn(name = "student_id") // optional
    private Student student;
}