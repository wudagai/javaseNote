package com.nesoft.javase.propertyandmethod;

import java.util.Scanner;
import com.nesoft.javase.practice.Person;
//import com.nesoft.javase.practice.*; //不建议
//import com.nesoft.javase.practice.Student;

public class TestPerson {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.getResult();
		
		com.nesoft.javase.practice.Student s1=new com.nesoft.javase.practice.Student();
		s1.getName();
		
		Student s2=new Student();
		s2.getName();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------");
	}
}
