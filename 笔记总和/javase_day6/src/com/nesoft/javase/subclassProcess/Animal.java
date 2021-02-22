package com.nesoft.javase.subclassProcess;

public class Animal {
	int age;
	int sex;
	
	{
		System.out.println("Animal 的构造代码块");
	}
	
	static {
		System.out.println("Animal 的静态代码块 ");
	}
	
	
	public Animal() {
		System.out.println("Animal 的构造方法");
	}
}
