package com.nesoft.javase.practice;

public class Student {
//	所有学生对象公有的特征，声明为类中的属性
	int stuId;
	String stuName;
	String className;
	int stuAge;
//	所有学生对象公有的行为,声明为类中的方法
	public void study() {
		System.out.println("学生学习");
	}
	
	public String getName() {
		System.out.println("------------com.nesoft.javase.practice包中的Student---------------");
		System.out.println("查询学生姓名");
		return null;
	}
	
	public static void main(String[] args) {
//		Student s1=new Student();  //Student s1 句柄
//		Student s2=new Student();
//		Student s1; 
//		s1=new Student();
//		s1=new Student();
		
//		如果只使用该对象进行一次方法或属性调用，可以创建匿名对象。
//		创建匿名对象  :节省内存
		new Student();
//		创建完对象，在调用该对象的属性或方法时，也可以不定义对象的句柄，而直接调用这个对象的方法。这样的对象叫匿名对象
		new Student().stuName="zhangsan";
		System.out.println(new Student().stuName);//null
		new Student().getName();

	}
	

}
