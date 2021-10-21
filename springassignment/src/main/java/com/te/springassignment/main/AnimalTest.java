package com.te.springassignment.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springassignment.bean.Pet;
import com.te.springassignment.config.AllConfig;

public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
//		Pet pet = (Pet) context.getBean("pet");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet);
		System.out.println(pet.getName());
	}
}