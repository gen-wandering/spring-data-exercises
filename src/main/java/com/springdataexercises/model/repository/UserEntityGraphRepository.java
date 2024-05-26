package com.springdataexercises.model.repository;

import com.springdataexercises.model.base.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*
 * If only @EntityGraph annotation is used, Spring need to
 * be able to form PartTreeJpaQuery form the method's name,
 * Otherwise @Query can be used.
 *
 * @EntityGraph(attributePaths = {"books"}) - new graph
 * @EntityGraph(value = "with-books") - existed graph
 * */
public interface UserEntityGraphRepository extends CrudRepository<User, Integer> {
    // @EntityGraph(attributePaths = {"books"})
    @EntityGraph(value = "with-books")
    User findUserById(Integer id);

    // EntityGraph is applied to the specified @Query
    @EntityGraph(value = "with-books")
    @Query("SELECT u FROM User u")
    List<User> findAllUsersWithBooks();
}