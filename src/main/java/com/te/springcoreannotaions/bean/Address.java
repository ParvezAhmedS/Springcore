package com.te.springcoreannotaions.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.val;

@Data
@Component("add1")
public class Address implements Serializable{
	@Value("RNR")
private String city;
	@Value("KAR")
private String state;
}
