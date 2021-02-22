package com.nesoft.javase.extend;
/**
 * 爷爷
 * @author Administrator
 *
 */
public class GrandFather extends Person{
/*	String name;
	int age;
	String sex;*/
	String address;
	
/*	public void eat() {
		System.out.println("人都可以吃东西");
	}
	public void sleep() {
		System.out.println("人都可以睡觉");
	}*/
	public void farming() {
		System.out.println("爷爷种地");
	}
//	@Override
//	public String toString() {
//		return "GrandFather [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
//	}
	@Override
	public String toString() {
		return "GrandFather [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
