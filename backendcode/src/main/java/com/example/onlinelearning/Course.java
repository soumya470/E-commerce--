package com.example.onlinelearning;

import java.util.List;

public class Course {

    private int id;
    private String title;
    private String duration;
    private String description;
    private List<String> lessons;

    public Course(int id, String title, String duration,
                  String description, List<String> lessons) {

        this.id = id;
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.lessons = lessons;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getLessons() {
        return lessons;
    }
}