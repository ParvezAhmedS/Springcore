package com.te.springcoreannotaions.assighnment1;

import lombok.Data;

@Data
public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("cat is eating");

	}

	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
	}

}
