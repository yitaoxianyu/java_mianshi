package com.xianyu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = (Student) context.getBean("student");
        System.out.println(student1);
        student1.say("111");
        context.close();
    }
}
