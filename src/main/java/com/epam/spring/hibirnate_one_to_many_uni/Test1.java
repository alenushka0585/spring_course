package com.epam.spring.hibirnate_one_to_many_uni;

import com.epam.spring.hibirnate_one_to_many_uni.entity.Department;
import com.epam.spring.hibirnate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                        addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
        session = factory.getCurrentSession();


//            Department department = new Department("HR",
//                    1500, 500);
//            Employee emp1 = new Employee("Oleg", "Ivanov",
//                    750);
//            Employee emp2 = new Employee("Andrey", "Sidorov",
//                    1000);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");


        }finally {
            session.close();
            factory.close();
        }
    }
}
