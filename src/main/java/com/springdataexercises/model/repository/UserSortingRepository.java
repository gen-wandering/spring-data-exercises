package com.springdataexercises.model.repository;

import com.springdataexercises.model.base.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSortingRepository extends JpaRepository<User, Integer> {
}
