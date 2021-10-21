package com.te.springassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springassignment.bean.Pet;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Dog");
		return pet;
	}
}
