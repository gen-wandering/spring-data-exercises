package com.springdataexercises.runner;

import com.springdataexercises.model.projection.NameAndDateDto;
import com.springdataexercises.model.repository.UserProjectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

// @Component
@RequiredArgsConstructor
public class ProjectionRunner implements CommandLineRunner {
    private final UserProjectionRepository userProjectionRepository;

    /*
    * Projection with native query requires interface as DTO
    * */

    @Override
    public void run(String... args) {
        getUserNameAndBirthDateInProjection();
    }

    private void getUserNameAndBirthDateInProjection() {
        NameAndDateDto userNameAndDate = userProjectionRepository.getUserNameAndDate(1);
        System.out.println(userNameAndDate);
        System.out.println(userNameAndDate.getFirstName());
        System.out.println(userNameAndDate.getBirthDate());
    }

    // Exception in projection
    private void getUserWithBookTitlesInProjection() {
        var userWithBookTitles = userProjectionRepository.getUserWithBookTitles(1);
    }

    // List<Object[]>
    private void getUsersWithBookTitles() {
        var userWithBookTitles = userProjectionRepository.getUsersWithBookTitles();
        userWithBookTitles.forEach(user -> System.out.println(Arrays.toString(user)));
    }
}
