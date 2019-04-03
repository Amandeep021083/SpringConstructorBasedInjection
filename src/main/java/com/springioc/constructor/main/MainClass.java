package com.springioc.constructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.constructor.beans.Car;
import com.springioc.constructor.beans.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car.toString());
		
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
	}

}
