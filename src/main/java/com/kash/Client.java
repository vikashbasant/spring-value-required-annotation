package com.kash;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        // Creating an object using beans.xml file
        // inside the beans.xml file, we need to specify the class which we want an object:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("=>>beans.xml file config loaded!<<=");

        // Get Beans with id="student" from beans.xml file:
        Student student = context.getBean("student", Student.class);
        student.displayStudentInfo();
    }
}
