package com.example.demo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo4.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}