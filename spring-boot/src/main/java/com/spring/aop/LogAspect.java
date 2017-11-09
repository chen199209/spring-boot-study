package com.spring.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect //声明一个切面
@Component //让此切面为spring容器管理的Bean
public class LogAspect {
	
	//注解切点
	@Pointcut("@annotation(com.spring.aop.Action)")
	public void annotationPointCut() {}
	
	//注解声明一个建言 并使用@PointCut定义的切点
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		//通过反射可获得注解上的属性，然后做日志记录相关操作
		System.out.println("注解式拦截" + action.name());
	}
	
	//声明一个建言，此建言直接使用拦截规则为参数
	@Before("execution(* com.spring.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截" + method.getName());
	}
}
