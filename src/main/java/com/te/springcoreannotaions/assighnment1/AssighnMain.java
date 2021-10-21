package com.te.springcoreannotaions.assighnment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class AssighnMain {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
	Pet pet =    (Pet) context.getBean("pet");
	System.out.println(pet);
	pet.call();
	
}

}
