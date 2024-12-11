package com.xianyu.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xianyu")
public class Config {

    //使用bean注解创建的bean类,会将方法名称作为bean的id或name
    //scope注解可以指定bean为单例还是多例

}
