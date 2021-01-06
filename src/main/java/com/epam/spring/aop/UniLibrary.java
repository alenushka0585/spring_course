package com.epam.spring.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary " );
        System.out.println("___________________________________________");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("___________________________________________");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("___________________________________________");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary " );
        System.out.println("___________________________________________");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary " );
        System.out.println("___________________________________________");
    }
}
