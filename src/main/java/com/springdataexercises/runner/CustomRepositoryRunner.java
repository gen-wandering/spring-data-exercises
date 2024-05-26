package com.springdataexercises.runner;

import com.springdataexercises.model.base.Book;
import com.springdataexercises.model.repository.custom.CustomRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

//@Component
@RequiredArgsConstructor
public class CustomRepositoryRunner implements CommandLineRunner {
    private final CustomRepositoryService customRepositoryService;

    @Override
    public void run(String... args) {
        differentPersistenceContext();
    }

    private void theSamePersistenceContext() {
        /*
         * The same session is used for both repositories
         * in the service as they are invoked in the same transaction
         * */
        customRepositoryService.both();
    }

    // Will be the same under mutual transaction
    private void differentPersistenceContext() {
        var user1 = customRepositoryService.firstRepositoryFind();
        var user2 = customRepositoryService.secondRepositoryFind();

        List<Book> books1 = user1.getBooks();
        List<Book> books2 = user2.getBooks();

        System.out.println(books1.getClass());
        System.out.println(books2.getClass());

        System.out.println(books1);
        System.out.println(books2);
        System.out.println("books1.equals(books2): " + books1.equals(books2)); // ?!

        System.out.println("ArrayList.equals: "
                           + new ArrayList<>(books1).equals(new ArrayList<>(books2)));
    }

    private void differentPersistenceContextInTheSameRepository() {
        customRepositoryService.firstRepositoryFind();
        customRepositoryService.firstRepositoryFind();
    }
}
