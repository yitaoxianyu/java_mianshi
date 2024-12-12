package com.xianyu;

import com.xianyu.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student");

        student1.say("111");
        context.close();
*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student1 = (Student) context.getBean("student1");
        student1.say("hello world");
    }
}
