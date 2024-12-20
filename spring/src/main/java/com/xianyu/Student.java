package com.xianyu;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component("student1")
public class Student {

    private String name;

    private Integer age;

    @Autowired
    @Qualifier(value = "card1")
    private Card card;


    //这样写是想使用set方法进行注入
    //@Autowired
    public void setCard(Card card) {
        System.out.println("通过set方法注入");
        this.card = card;
    }

    //也可以通过构造函数注入
    public Student(Card card){
        this.card = card;
    }

    public void say(String content){
        System.out.println(content);
    }
}
