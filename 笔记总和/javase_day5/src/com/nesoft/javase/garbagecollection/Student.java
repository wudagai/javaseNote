package com.nesoft.javase.garbagecollection;
/**
 * 垃圾回收机制：
 * 	JVM内部一条优先级较低的后台线程帮助程序员回收垃圾 finalize()
 * 	当没有引用指向的时候该对象会被识别成垃圾并回收
 * 
 * @author Administrator
 *
 */
public class Student {

	int stuId;
	String stuName;
	String className;
	int stuAge;
	public void study() {
		System.out.println("学生学习");
	}
	
	public String getName() {
		System.out.println("查询学生姓名");
		return null;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.getName();
		s1=null;
//		匿名对象
		new Student().getName();
		System.out.println("一万行代码");
		
		Student s2=new Student();
		Student s3=s2;
		s2=null;
//		超出变量的生命周期
		for(int i=0;i<10;i++) {
			Student s4=new Student();
		
		}
//		提高变量的生命周期
		if(true) {
			Student s5=new Student();
		}
//		System.out.println(s5); 编译不通过
		Student s6=null;
		if(false) {
			s6=new Student();
		}
		System.out.println(s6);
		
		
	}
}
