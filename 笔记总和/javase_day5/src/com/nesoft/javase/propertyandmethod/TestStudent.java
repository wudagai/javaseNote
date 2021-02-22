package com.nesoft.javase.propertyandmethod;

public class TestStudent {
	public static void main(String[] args) {
//		创建一个student对象
		/**
		 * new:内存空间分配符，在堆内存中创建对象
		 */
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s1.stuId);// 0
		System.out.println(s1.stuName);// null
		System.out.println(s1.grade); //0.0
		System.out.println(s1.status);//false
		System.out.println(s1);
		s1.study();
//		成员变量的赋值 
//		注意：赋值的数据类型要与成员变量的数据类型一致
		s1.stuId=1;
		s1.stuName="凯哥";
		s1.grade=90.0;
		s1.status=true;
		System.out.println(s1.stuId);// 1
		System.out.println(s1.stuName);// 凯哥
		System.out.println(s1.grade); //90.0
		System.out.println(s1.status);//true
		s1.study();
		
		System.out.println("s1-------------------");
//		s1.study();
		System.out.println("s2-------------------");
		System.out.println(s2.status);//false
		s2.stuName="lisi";
		s2.study();
		
		s2.getName();
		s1.getName();	
	}

}
