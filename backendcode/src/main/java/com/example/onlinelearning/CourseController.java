package com.example.onlinelearning;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return List.of(

                new Course(
                        1,
                        "Java Full Stack",
                        "8 Weeks",
                        "Learn Java, Spring Boot, HTML, CSS and JavaScript.",
                        List.of(
                                "Introduction",
                                "Java Basics",
                                "Spring Boot",
                                "Frontend Development"
                        )
                ),

                new Course(
                        2,
                        "Python Basics",
                        "6 Weeks",
                        "Learn Python programming from scratch.",
                        List.of(
                                "Variables",
                                "Loops",
                                "Functions",
                                "Projects"
                        )
                ),

                new Course(
                        3,
                        "Web Development",
                        "5 Weeks",
                        "Master HTML, CSS and JavaScript.",
                        List.of(
                                "HTML",
                                "CSS",
                                "JavaScript",
                                "Responsive Design"
                        )
                )
        );
    }
}