package com.te.springcoreannotaions.assighnment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {
	@Bean(name = "dog")
	public Animal getDog() {
		return new Dog();
	}

	@Bean(name = "cat")
	public Animal getCat() {
		return new Cat();
	}
}
