package com.nesoft.javase.策略模式;

import java.util.ArrayList;

import com.nesoft.javase.entity.Student;

public class Test {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
//		调用方法获取结果
		ArrayList<Student> stuListGrade=dao.getResult();
		for(Student s:stuListGrade) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		ArrayList<Student> stuListAge=dao.getResult1();
		for(Student s:stuListAge) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
	
		ArrayList<Student> stuListSex=dao.getResult2();
		for(Student s:stuListSex) {
			System.out.println(s);
		}
	}
}
