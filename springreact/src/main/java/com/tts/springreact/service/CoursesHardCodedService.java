package com.tts.springreact.service;

import java.util.ArrayList;
import java.util.List;

import com.tts.springreact.model.Course;

import org.springframework.stereotype.Service;

@Service
public class CoursesHardCodedService {

    private static List<Course> courses = new ArrayList<>();
    private static long idCounter = 0;

    static {
        courses.add(new Course(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(++idCounter, "in28minutes", "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(++idCounter, "in28minutes",
                "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course deleteById(long id) {
    Course course = findById(id);

    if (course == null)
      return null;

    if (courses.remove(course)) {
      return course;
    }

    return null;
  }

// This was autogenerated to correct the error freom the findById method.
  private Course findById(long id) {
      return null;
  }

}