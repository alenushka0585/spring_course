package com.epam.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet{
//    private String name;

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
