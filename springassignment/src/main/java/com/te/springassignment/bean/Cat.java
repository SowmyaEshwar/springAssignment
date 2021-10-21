package com.te.springassignment.bean;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat also eats non-veg");
	}

	@Override
	public void speak() {
		System.out.println("cats meows");
	}

}
