package com.nesoft.javase.override;

public class Cat extends Animal{
	
	public void eat() {
		System.out.println("Cat 猫吃猫粮");
	}
	
	
	public String sleep() {
		System.out.println("Cat Cat站着睡觉");
		return "Cat 睡得香";
	}

}
