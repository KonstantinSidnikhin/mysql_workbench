package com.sidnikhin.spring.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university=context.getBean("universityBean",University.class);
        university.addStudent();
        List<Student> studentsTwo=university.getStudents();
        System.out.println(studentsTwo);
        context.close();
    }
}
