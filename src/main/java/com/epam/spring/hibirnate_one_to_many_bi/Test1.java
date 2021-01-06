package com.epam.spring.hibirnate_one_to_many_bi;

import com.epam.spring.hibirnate_one_to_many_bi.entity.Employee;
import com.epam.spring.hibirnate_one_to_many_bi.entity.Department;
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


//            Department department = new Department("Sales",
//                    1500, 800);
//            Employee emp1 = new Employee("Alex", "Petrov",
//                    800);
//            Employee emp2 = new Employee("Anton", "Sidorov",
//                    800);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            Department department = session.get(Department.class, 3);
//            session.save(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");


        }finally {
            session.close();
            factory.close();
        }
    }
}
