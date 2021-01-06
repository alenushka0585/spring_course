package com.epam.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibraryBean = context.getBean("uniLibraryBean", UniLibrary.class);
        uniLibraryBean.getBook();
        uniLibraryBean.returnMagazine();
        uniLibraryBean.addBook("Zaur", book);
        uniLibraryBean.addMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();

    }
}
