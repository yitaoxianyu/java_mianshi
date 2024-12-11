package com.xianyu;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component(value = "student1")
public class Student {

    private String name;

    private Integer age;

    private Card card;

    @Autowired
    public void setCard(Card card) {
        System.out.println("通过方法");
        this.card = card;
    }

    public void say(){
        System.out.println("hello world");
    }
}
