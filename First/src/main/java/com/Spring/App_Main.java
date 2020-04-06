package com.Spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App_Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext iocContainer = 
			new ClassPathXmlApplicationContext("Beans_simple.xml");
		Account account = (Account)iocContainer.getBean("Account");
		System.out.println(account);
		iocContainer.registerShutdownHook();
	}

}
