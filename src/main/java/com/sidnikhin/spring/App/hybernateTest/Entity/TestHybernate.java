package com.sidnikhin.spring.App.hybernateTest.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestHybernate {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session=factory.getCurrentSession();
            Employee emp=new Employee("James","Smith","SALES",2400);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }

    }
}
