package com.te.springcoreannotaions.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = context.getBean("person" , Person.class);
		person.getPerson();
		System.out.println(person);
	}
}
