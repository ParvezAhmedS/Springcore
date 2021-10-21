package com.te.springcoreannotaions.withoutxml;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class Person implements Serializable {
	@Value("200")
private int id;
	@Value("Parvez")
private String name;
	@Autowired
	private Address address;

	public void getPerson() {
		System.out.println("getting data from person");
	}
}
