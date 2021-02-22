package com.nesoft.javase.override;

public class Dog extends Animal{
	
//	public String eat() {  编译不通过
//		System.out.println("Dog 狗吃狗粮");
//	}
//	
	@Override
	public void eat() {
		System.out.println("Dog 狗吃狗粮");
	}
	
	public String sleep(String dname) {
		System.out.println("Dog Dog爬着睡觉"+dname);
		return "Dog 睡得香";
	}
	@Override
	public void play() {
		System.out.println("Dog 玩的开心");
	}

//	private  void play() {
//		System.out.println("Dog 玩的开心");	
//	}

}
