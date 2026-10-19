package com.microservice.course.service;

import com.microservice.course.entities.Course;

import java.util.List;

public interface ICourseService {
    List<Course> finAll();
    Course findById(Long id);
    Course save(Course course);
}
