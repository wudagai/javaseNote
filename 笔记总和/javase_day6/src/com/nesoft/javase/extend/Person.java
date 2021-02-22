package com.nesoft.javase.extend;
/**
 * 人类
 * @author Administrator
 *
 */
public class Person {
	String name;
	int age;
	private String sex;
	
	public void eat() {
		System.out.println("人都可以吃东西");
	}
	public void sleep() {
		System.out.println("人都可以睡觉");
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
