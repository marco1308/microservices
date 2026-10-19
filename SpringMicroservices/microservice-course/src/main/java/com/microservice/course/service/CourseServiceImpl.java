package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseRepository courseRepository;

    @Override
    public List<Course> finAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
