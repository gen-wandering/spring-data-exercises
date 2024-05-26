package com.springdataexercises.model.repository;

import com.springdataexercises.model.base.User;
import com.springdataexercises.model.projection.NameAndDateDto;
import com.springdataexercises.model.projection.UserWithBookTitlesDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserProjectionRepository extends CrudRepository<User, Integer> {

    @Query(value = """
            SELECT u.first_name AS "firstName", u.birth_date AS "birthDate"
            FROM users u
            WHERE u.id = :id
            """, nativeQuery = true)
    NameAndDateDto getUserNameAndDate(@Param("id") Integer id);

    // JPA не может автоматически собрать список книг в одно поле DTO из
    // нескольких строк результатов.
    @Query(value = """
            SELECT u.first_name, u.last_name, b.title
            FROM users u
                     JOIN books b on u.id = b.user_id
            WHERE u.id = :id
            """, nativeQuery = true)
    UserWithBookTitlesDto getUserWithBookTitles(@Param("id") Integer id);

    @Query(value = """
            SELECT u.first_name, u.last_name, b.title
            FROM users u
                     JOIN books b on u.id = b.user_id
            """,
            nativeQuery = true)
    List<Object[]> getUsersWithBookTitles();
}
