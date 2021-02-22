package com.nesoft.javase.propertyandmethod;
/**
 * 	变量必须初始化的时候才能被访问
 * 
 * 	当对象创建的同时完成了对象的初始化工作
 *  访问属性(成员变量)：
 *  	通过对象的引用(变量)加" ." 点运算符访问
 * 访问成员方法
 * 		成员方法初始化之后才能被调用,通过对象的引用(变量)加" ." 点运算符访问 
 *       注意：成员方法能直接访问成员变量
 * 		成员变量的作用域范围：在整个类中生效
 * 		局部变量能和成员变量同名
 * 		如果成员变量和局部变量同名怎么办?  使用this关键字规定变量是成员变量     
 *		this：当前实例化对象
 */
public class Student {
//	属性(成员变量)
	int stuId;
	String stuName;
	String className;
	double grade;
	boolean status;
	int stuAge;
//	成员方法
	public void study() {
		System.out.println("学生学习"+stuName);
	}
	
	public String getName() {
		System.out.println("-----com.nesoft.javase.propertyandmethod中的Student------");
		String stuName="zhangsan";
//		使用this区分成员变量和局部变量
		System.out.println("查询学生姓名"+this.stuName);
		System.out.println("查询学生姓名"+stuName);
		return null;
	}
}
