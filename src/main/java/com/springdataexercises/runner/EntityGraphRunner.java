package com.springdataexercises.runner;

import com.springdataexercises.model.repository.UserEntityGraphRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

// @Component
@RequiredArgsConstructor
public class EntityGraphRunner implements CommandLineRunner {
    private final UserEntityGraphRepository userEntityGraphRepository;

    @Override
    public void run(String... args) {
        userEntityGraphRepository.findUserById(1);
        System.out.println();
        userEntityGraphRepository.findAllUsersWithBooks().forEach(System.out::println);
    }
}
