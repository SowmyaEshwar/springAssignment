package com.te.springassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springassignment.bean.Animal;
import com.te.springassignment.bean.Cat;
import com.te.springassignment.bean.Dog;

@Configuration
public class AnimalConfig {
	@Bean("dog")
	public Animal getDog() {
		Animal animal = new Dog();
		animal.eat();
		animal.speak();
		return animal;
	}
	
	@Bean("cat")
	public Animal getCat() {
		Animal animal = new Cat();
		animal.eat();
		animal.speak();
		return animal;
	}
}
