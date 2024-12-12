package com.xianyu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class AopTest {


    @Before("execution(* com.xianyu.Student.say(String))")
    public void before(JoinPoint joinPoint)
    {
        //joinPoint可以拿到方法
        System.out.println("before");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }


    public void after(){
        System.out.println("after");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //环绕式的增强,需要自己处理代码的执行顺序
        System.out.println("调用环绕方法");
    }
}
