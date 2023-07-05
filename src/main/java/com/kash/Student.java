package com.kash;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    @Value(value = "${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student interested course: " + this.interestedCourse);
        System.out.println("Student hobby: " + this.hobby);
    }
}
