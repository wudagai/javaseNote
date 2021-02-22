package com.nesoft.javase.objectoriented;

public class TestStudent {
	public static void main(String[] args) {
//		对象的创建
		/* 
		 * new:内存空间分配符
		 */
		Student s1=new Student();
		/*System.out.println(s1.stuAge);
		System.out.println(s1.className);*/
		s1.stuId=1;
		s1.stuName="zhangsan";
		System.out.println(s1.stuName);
		
		Student s2=new Student();
		s2.stuId=2;
		s2.stuName="凯哥";
		System.out.println(s2.stuName);
		
	}

}
