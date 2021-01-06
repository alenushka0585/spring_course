package com.epam.spring.hibernate_test;

import com.epam.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
        Session session = factory.getCurrentSession();

        session.beginTransaction();
//        Employee employee = new Employee("Elena", "Kaloshina", "HR", 850);
//        session.save(employee);
            session.createQuery("update Employee set salary=900" +
                    " where name='Elena'").executeUpdate();

        session.getTransaction().commit();

            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}
