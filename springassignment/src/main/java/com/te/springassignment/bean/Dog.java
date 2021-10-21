package com.te.springassignment.bean;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eats non-veg");
	}

	@Override
	public void speak() {
		System.out.println("Dog barks");
	}

}
