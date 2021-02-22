package com.nesoft.javase.Interface;

public class Cat implements Animal{
	@Override
	public void getAge() {
	}

	@Override
	public String eat() {
		return null;
	}
	@Override
	public void sleep(int mills) {
		System.out.println("Cat 站着睡");
	}

/*	@Override
	public void fly() {
		
	}*/
}
