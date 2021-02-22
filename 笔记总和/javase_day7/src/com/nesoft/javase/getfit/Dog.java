package com.nesoft.javase.getfit;

public class Dog extends Animal{
	int age;
	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep");
	}
	
	public void dealer() {
		System.out.println("Dog 拆家");
	}

}
