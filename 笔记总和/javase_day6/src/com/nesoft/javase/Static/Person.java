package com.nesoft.javase.Static;
/**
 *  静态资源在类加载的时候就完成了初始化
 *  类加载只进行一次而可以实例化多次
 * 	静态代码块：给静态变量赋值
 * @author Administrator
 *
 */
public class Person {
	static int age;
	String name;
	Student stu=new Student();
//	静态代码块
	static {
		age=20;
		System.out.println("静态代码块");
	}
//	构造代码块
	{
		System.out.println("构造代码块");
		
	}
//	构造方法
	public Person() {
		
		System.out.println("构造方法");
	}
	
	
	public static void main(String[] args) {
//		Person p=new Person();
//		Person p1=new Person();
//		Person p2=new Person();
		
		Teacher t=new Teacher();
	
//		System.out.println(age);
	}

}
