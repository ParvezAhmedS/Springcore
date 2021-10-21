package com.te.springcoreannotaions.assighnment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Boxer");
		return pet;
	}
}
