package com.springdataexercises.model.projection;

import java.time.LocalDate;

public interface NameAndDateDto {
    String getFirstName();

    LocalDate getBirthDate();
}
