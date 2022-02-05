package com.sidnikhin.spring.App;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component ("universityBean")
public class University {
    List<Student> students=new ArrayList<>();

    public void addStudent(){
        Student student1=new Student("Konstantin Sidnikhin",5,8.5);
        Student student2=new Student("Pavel Mishutov",4,8.8);
        Student student3=new Student("Leonid Talmachev",3,8.9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student>getStudents(){
        System.out.println("Возвращаем массив студентов");
        return(students);
    }
}
