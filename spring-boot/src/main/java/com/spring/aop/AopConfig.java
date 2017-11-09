package com.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring.aop")
@EnableAspectJAutoProxy //注解开启spring对AspectJ代理的支持
public class AopConfig {

}
