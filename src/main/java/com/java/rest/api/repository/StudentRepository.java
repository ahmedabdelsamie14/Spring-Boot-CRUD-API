package com.java.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.rest.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
