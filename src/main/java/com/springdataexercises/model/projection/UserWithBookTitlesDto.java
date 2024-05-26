package com.springdataexercises.model.projection;

import java.util.List;

public interface UserWithBookTitlesDto {
    String getFirstName();
    String getLastName();
    List<String> getBookTitles();
}
