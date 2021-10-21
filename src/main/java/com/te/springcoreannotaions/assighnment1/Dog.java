package com.te.springcoreannotaions.assighnment1;

import lombok.Data;

@Data

public class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is slepping");
	}

}
