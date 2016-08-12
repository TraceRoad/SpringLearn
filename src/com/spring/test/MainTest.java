package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:Bean.xml");
		Message bean = (Message)applicationContext.getBean("Message");
		String message = bean.getMessage();
		System.out.println(message);
	}

}
