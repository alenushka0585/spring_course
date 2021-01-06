package com.epam.spring.hibernate_one_to_one;

import com.epam.spring.hibernate_one_to_one.entity.Detail;
import com.epam.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                        addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
        session = factory.getCurrentSession();
//        Employee employee = new Employee("Zaur", "Tregulov",
//                "IT", 500);
//        Detail detail = new Detail("Baku","123466",
//                "zaurtregulov@gmail.com" );
//        employee.setEmpDetail(detail);
//
//        session.beginTransaction();
//        session.save(employee);
//
//        session.getTransaction().commit();

//

//            session.beginTransaction();
//            Employee emp = session.get(Employee.class,1);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session.beginTransaction();
            Employee emp = session.get(Employee.class,2);
            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("Done!");


        }finally {
            session.close();
            factory.close();
        }
    }
}
