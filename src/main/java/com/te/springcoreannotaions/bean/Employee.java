package com.te.springcoreannotaions.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	@Value("001")
private int id;
	@Value("Parvez")
private String name;
	@Autowired
	@Qualifier("add1")
private Address address;
}
