package com.explanatory.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "explanatory"),
                new Course(1, "Learn Devops", "explanatory"),
                new Course(1, "Learn Azure", "explanatory")
        );
    }

}
