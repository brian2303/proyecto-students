package com.reactive.students.studentsproject.repository;

import com.reactive.students.studentsproject.model.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentReactiveRepository extends ReactiveCrudRepository<Student,String> {
}
