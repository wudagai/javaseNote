package com.nesoft.javase.Final;
/**
 * final关键字：
 * 		①修饰方法不能被重写
 * 		②修饰的类不能被继承
 * 		③修饰的变量不能第二次赋值
 * 			1、局部变量
 * 			2、修饰成员变量和静态变量时需要给其赋初始值，因为系统不会对final属性默认的赋初始值
 *变量：在程序运行过程中随时可能发生改变的量 	
 * 常量：在程序运行过程中一直不变的量   [访问修饰符] fianl static int age;
 * 	
 * 		
 * @author Administrator
 *
 */
public  class Student {
//	final int age=20;
//	final static int age=20;
	final static int  sex=10;
	private final static int age=20;
	
	
	public static void main(String[] args) {
		final int a;
		a=10;
		System.out.println(a);
		Student s=new Student();
		System.out.println(s.age);
		Student s1=new Student();
		System.out.println(s1.age);

		
		
	}

}
