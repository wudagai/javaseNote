package com.nesoft.javase.Abstract;

public  class Dog extends Animal{
	public Dog() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("Dog 吃狗粮");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog 趴着睡");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		System.out.println(d.name);
		d.name="旺财";
		d.getName();
		
		Dog d1=new Dog();
		d1.name="旺旺";
		d1.getName();
	}
	

}
