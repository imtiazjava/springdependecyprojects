package com.bms.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext bref = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = bref.getBean("emp", Employee.class);
		System.out.println(e.toString());

	}

}
