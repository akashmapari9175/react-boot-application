package com.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.Course;
import com.course.repository.CourseRepo;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private  CourseRepo courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    // Additional methods for update and delete if needed
}

