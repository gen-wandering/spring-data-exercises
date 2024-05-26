package com.springdataexercises.model.converter;

import com.springdataexercises.model.base.Birthday;
import jakarta.persistence.AttributeConverter;

import java.sql.Date;

public class BirthdayConverter implements AttributeConverter<Birthday, Date> {
    @Override
    public Date convertToDatabaseColumn(Birthday birthday) {
        return Date.valueOf(birthday.getBirthdate());
    }

    @Override
    public Birthday convertToEntityAttribute(Date date) {
        return new Birthday(date.toLocalDate());
    }
}
