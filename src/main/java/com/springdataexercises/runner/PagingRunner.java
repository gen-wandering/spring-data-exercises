package com.springdataexercises.runner;

import com.springdataexercises.model.base.User;
import com.springdataexercises.model.repository.UserPagingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

//@Component
@RequiredArgsConstructor
public class PagingRunner implements CommandLineRunner {
    private final UserPagingRepository userPagingRepository;

    @Transactional(readOnly = true)
    @Override
    public void run(String... args) {
        Pageable pageRequest = PageRequest.of(
                0,
                2,
                Sort.by("id").descending()
        );

        Slice<User> slice = userPagingRepository.findAllBy(pageRequest);
        slice.forEach(user -> System.out.println("userId: " + user.getId()));
        while (slice.hasNext()) {
            slice = userPagingRepository.findAllBy(slice.nextPageable());
            slice.forEach(user -> System.out.println("userId: " + user.getId()));
        }
    }
}
