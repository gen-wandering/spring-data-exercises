package com.springdataexercises.model.repository.custom;

import com.springdataexercises.model.base.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomRepositoryService {
    private final CustomRepository1 cr1;
    private final CustomRepository2 cr2;

    @Transactional
    public void both() {
        User user1 = cr1.findUser(1);
        User user2 = cr2.findUser(1);

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }

    @Transactional
    public User firstRepositoryFind() {
        User user = cr1.findUser(1);
        System.out.println(user);
        return user;
    }

    @Transactional
    public User secondRepositoryFind() {
        User user = cr2.findUser(1);
        System.out.println(user);
        return user;
    }
}
