package com.nesoft.javase.practice;

import java.util.Arrays;

public class MinStudent {
	String name;
	int stuNo;
	double grade;
	public MinStudent(String name, int stuNo, double grade) {
		this.name = name;
		this.stuNo = stuNo;
		this.grade = grade;
	}
	public MinStudent(String name) {
		this.name = name;
	}
	public MinStudent() {
	
	}
	

	public String getResult() {
		return "MinStudent [name=" + name + ", stuNo=" + stuNo + ", grade=" + grade + "]";
	}
	public static void main(String[] args) {
		MinStudent s1=new MinStudent("zhangsan",1,90);
		MinStudent s2=new MinStudent("lisi",2,97);
		MinStudent s3=new MinStudent("wangwu",3,88);
		MinStudent s4=new MinStudent("jack",4,60);
		MinStudent s5=new MinStudent("tom",5,99);
		
		MinStudent[] ms= {s1,s2,s3,s4,s5};
//		for(MinStudent minStu:ms) {
//			System.out.println(minStu.getResult());
//		}
		for(int i=1;i<ms.length;i++) {
			for(int j=0;j<ms.length-i;j++) {
				if(ms[j].grade<ms[j+1].grade) {
					MinStudent m=ms[j];
					ms[j]=ms[j+1];
					ms[j+1]=m;
				}
			}
		}
	
//		将排好序的数组输出
		for(MinStudent minStu:ms) {
		System.out.println(minStu.getResult());
	}
	}
}
