package com.nesoft.javase.subclassProcess;

public class HelloKitty extends Cat{
	

	{
		System.out.println("HelloKitty 的构造代码块");
	}
	
	static {
		System.out.println("HelloKitty 的静态代码块 ");
	}
	public HelloKitty() {
		System.out.println("HelloKitty 的构造方法");
	}

}
