package com.springdataexercises.repository;

import com.springdataexercises.model.Enrollment;
import com.springdataexercises.model.EnrollmentId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EnrollmentRepository extends CrudRepository<Enrollment, EnrollmentId> {
    List<Enrollment> findAllByCourse_Id(Integer course_id);
}
