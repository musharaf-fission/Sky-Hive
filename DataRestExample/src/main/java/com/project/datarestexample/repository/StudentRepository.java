package com.project.datarestexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.datarestexample.model.Student;

@RepositoryRestResource(path = "boy")
public interface StudentRepository extends JpaRepository<Student, Long> {

}
