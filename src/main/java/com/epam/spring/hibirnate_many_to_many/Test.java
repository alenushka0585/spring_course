package com.epam.spring.hibirnate_many_to_many;

import com.epam.spring.hibirnate_many_to_many.entity.Child;
import com.epam.spring.hibirnate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

//            Section section = new Section("Dance");
//
//            Child child1 =  new Child("Olya", 5);
//            Child child2 =  new Child("Kostay", 6);
//            Child child3 =  new Child("Nikita", 4);
//
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.persist(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//    *******************************************************

//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child1 =  new Child("Igor", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//    *******************************************************


//            session.beginTransaction();
//           Child child = session.get(Child.class,4);
//            System.out.println(child);
//
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//    *******************************************************

            session.beginTransaction();
            Child child = session.get(Child.class, 8);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
