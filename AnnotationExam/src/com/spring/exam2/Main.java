package com.spring.exam2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("config.xml");
		
		Object obj = ctx.getBean("first");
		System.out.println(((First)obj).getSecond().getAge());
	}

}
