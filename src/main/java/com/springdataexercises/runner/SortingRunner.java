package com.springdataexercises.runner;

import com.springdataexercises.model.base.User;
import com.springdataexercises.model.repository.UserSortingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Component
@RequiredArgsConstructor
public class SortingRunner implements CommandLineRunner {
    private final UserSortingRepository userSortingRepository;

    @Transactional
    @Override
    public void run(String... args) {
        var res = sortUsers();

        res.forEach(System.out::println); // lazy load
        System.out.println();
        res.forEach(System.out::println);
    }

    public List<User> sortUsers() {
        return userSortingRepository.findAll(Sort.by("name"));
    }
}
