package com.sidnikhin.spring.App.Aspects;

import com.sidnikhin.spring.App.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class Logging {
    @Before("execution(public * getStudents())")
    public void beforeAdvice(){
        System.out.println("log: before Advice");
    }
    @AfterReturning(pointcut = "execution(public * getStudents())",returning = "students")
    public void afterReturnAdvice(List<Student>students){
        Student target=students.get(0);
        String name="mr."+target.getNameSurname();
        double newGrade=target.getAvgGrade()+2;
        target.setAvgGrade(newGrade);
        target.setNameSurname(name);
    }
}
