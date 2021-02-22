package com.nesoft.javase.override;

public class Test {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.sleep("zhangsan");
		
		Cat c1=new Cat();
		c1.eat();
		c1.sleep();
		
		
	}
}
