package com.kash;

import org.springframework.beans.factory.annotation.Value;

/*
* @Value("${student.name:}") : this means name filed is optional
* @Value("${student.name}") : this field is mandatory
* */
public class Student {

    @Value("${student.name:}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value(value = "${student.hobby}")
    private String hobby;


    public void displayStudentInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student interested course: " + this.interestedCourse);
        System.out.println("Student hobby: " + this.hobby);
    }
}
