package com.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotionService {
	
	@Action(name = "注解式拦截add操作")
	public void add() {}
}
