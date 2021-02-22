package com.nesoft.javase.getfit;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("Cat eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep");
	}
	
	public void catchmice() {
		System.out.println("Cat 抓老鼠");
	}
	
}
