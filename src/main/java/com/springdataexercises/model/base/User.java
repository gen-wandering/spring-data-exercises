package com.springdataexercises.model.base;

import com.springdataexercises.model.converter.BirthdayConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NamedEntityGraph(name = "with-books", attributeNodes = @NamedAttributeNode("books"))
@NamedQuery(
        name = "getUsersOrderedByName",
        query = "SELECT u FROM User u ORDER BY u.name"
)
@Entity
@Table(name = "users", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Convert(converter = BirthdayConverter.class)
    @Column(name = "birth_date")
    private Birthday birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Roles role;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Book> books;

    public User(String name, String surname, Birthday birthday, Roles role) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.role = role;
    }
}