package com.springdataexercises.model.repository;

import com.springdataexercises.model.base.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPagingRepository extends JpaRepository<User, Integer> {
    Slice<User> findAllBy(Pageable pageable);
}
