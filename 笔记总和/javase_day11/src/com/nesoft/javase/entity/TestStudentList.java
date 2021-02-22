package com.nesoft.javase.entity;

import java.util.ArrayList;

public class TestStudentList {
	public static ArrayList<Student> studentList=new ArrayList<>();
	static {
		Student s1=new Student("zhangsan","neusoft",10,"男",90.0);
		Student s2=new Student("lisi","neusoft",10,"男",90.0);
		Student s3=new Student("wangwu","neusoft",10,"男",90.0);
		Student s4=new Student("zhaoliu","neusoft",10,"男",90.0);
		Student s5=new Student("kaige","neusoft",10,"男",90.0);
		Student s6=new Student("jack","neusoft",10,"男",90.0);
		Student s7=new Student("tom","neusoft",10,"男",90.0);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		
	}
	public static void main(String[] args) {
//		System.out.println(studentList);
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("-------------------------------");
//		输出名字为zhaoliu的学生
		for(Student s:studentList) {
			if("zhaoliu".equals(s.getName())) {
				System.out.println(s);
			}
		}
	}

}
