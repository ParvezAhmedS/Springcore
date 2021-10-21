package com.te.springcoreannotaions.assighnment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class Pet  {
	@Autowired
	@Qualifier("dog")
	private Animal animal;
	private String name;
	
	public void call() {
		animal.eat();
		animal.sleep();
	}
}
