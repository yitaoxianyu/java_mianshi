package com.xianyu;

import com.xianyu.config.Config;
import com.xianyu.mapper.TestMapper;
import org.mybatis.spring.SqlSessionTemplate;
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
        SqlSessionTemplate sqlSessionTemplate = context.getBean(SqlSessionTemplate.class);
        TestMapper mapper = context.getBean(TestMapper.class);
        mapper.getUser();
    }
}
