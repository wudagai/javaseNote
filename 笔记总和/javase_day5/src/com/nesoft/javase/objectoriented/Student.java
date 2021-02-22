package com.nesoft.javase.objectoriented;
/**
 * 类和对象的关系
 * 	类是对象的模板,类就是用来产生对象的
 * 	对象是类具体的实例
 * 
 * @author Administrator
 *  访问属性：
 *  	通过对象的引用(变量)加" ." 点运算符访问
 *  
 */
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
		System.out.println("查询学生姓名");
		return null;
	}
	
	
	

}
