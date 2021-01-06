package com.epam.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.epam.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
