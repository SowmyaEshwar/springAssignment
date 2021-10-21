package com.te.springassignment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {
	@Autowired
	@Qualifier("dog")
	private Animal dog;
	
	@Autowired
	@Qualifier("cat")
	private Animal cat;
	
	private String name;
}
