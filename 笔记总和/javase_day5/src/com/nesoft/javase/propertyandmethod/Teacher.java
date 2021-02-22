package com.nesoft.javase.propertyandmethod;

/**
 * 区别：
 * 局部变量：方法体中声明的变量、方法中的参数或代码块中声明的变量，都是局部变量,作用域范围在代码块中
 * 成员变量：在类中声明的变量，作用域访问在整个类中
 * 属性可以和局部变量同名，使用关键字this进行区分
  局部变量必须先声明，然后才能使用
  属性在整个类中生效，无论在什么地方声明
 * 	


 * 
 * @author Administrator
 *
 */
public class Teacher {
	int age;//成员变量
	
	public void getAge(int number) {
		
		int sex=1;//局部变量
		if(true) {
			String TeaName="zhangsan";//局部变量
		}
		System.out.println(sex);
		System.out.println(age);
	}

	public static void main(String[] args) {
		

	}

}
