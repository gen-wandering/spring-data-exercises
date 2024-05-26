package com.springdataexercises.repository;

import com.springdataexercises.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
