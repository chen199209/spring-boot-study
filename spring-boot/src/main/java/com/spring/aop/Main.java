package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotionService demoAnnotionService = context.getBean(DemoAnnotionService.class);
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		
//		demoAnnotionService.add();
//		demoMethodService.add();
		demoMethodService.pull();
		context.close();
	}

}
