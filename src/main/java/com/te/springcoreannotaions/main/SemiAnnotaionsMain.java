package com.te.springcoreannotaions.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoreannotaions.bean.Employee;

public class SemiAnnotaionsMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Employee employee = (Employee) context.getBean("employee");
	System.out.println(employee);
}
}
