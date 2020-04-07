package com.Spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext iocContainer= new ClassPathXmlApplicationContext("Department_Bean.xml");
		Employee employee=(Employee)iocContainer.getBean("Employee_1");
		System.out.println(employee);
	}

}
