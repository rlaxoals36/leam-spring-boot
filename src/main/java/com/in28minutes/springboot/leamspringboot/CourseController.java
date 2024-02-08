package com.in28minutes.springboot.leamspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1,"Learn AWS", "in28minuts"),
                new Course(2,"Learn DevOps", "in28minuts"),
                new Course(3,"Learn Azure", "in28minuts")
        );
    }
}
