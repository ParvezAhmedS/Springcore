package com.te.springcoreannotaions.withoutxml;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address implements Serializable {
	@Value("245")
	private int hno;

	@Override
	public String toString() {
		return "Address [hno=" + hno + "]";
	}
	
}
