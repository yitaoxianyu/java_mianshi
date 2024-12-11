package com.xianyu;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


//使用接口的实现类来实现aop
public class BeforeAdvisor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我是前置方法");
    }
}
