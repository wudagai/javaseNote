package com.nesoft.javase.encapsulation;
/**
 * 访问修饰符可以修饰属性和方法以及类,不能修饰局部变量
 *  修饰属性和方法：private、default、protected、public
 *  修饰类：public、default
 * @author Administrator
 *
 */
public class Animal {

	private int age;//	private

	int sex;//	default
	
	protected String name;//protected
	
	public String address;//public
	
	static String color;//	default
	
	protected static int weigth;
	
	public static void main(String[] args) {
		Animal a1=new Animal();
		
	}
	

}
