package com.springdataexercises.model.repository.custom;

import com.springdataexercises.model.base.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.internal.SessionImpl;
import org.springframework.stereotype.Repository;

@Repository
public class CustomRepository2 {
    // used in rare cases
    // @PersistenceContext(type = PersistenceContextType.EXTENDED)
    @PersistenceContext
    private EntityManager entityManager;

    public User findUser(int id) {
        System.out.println("entityManager [2]: " + entityManager);

        SessionImpl session = entityManager.unwrap(SessionImpl.class);
        System.out.println("entityManager.unwrap [2]: " + session);

        User user = entityManager.find(User.class, id);
        return user;
    }
}