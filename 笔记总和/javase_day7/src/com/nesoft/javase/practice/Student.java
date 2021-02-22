package com.nesoft.javase.practice;

public class Student extends Person implements Consumer{
	private String school;
	
	public Student(String school,String name,String sex,int age) {
		super(name,age,sex);
		this.school=school;
	}
	
	public void study() {
		System.out.println(this.school+","+this.getName()+","+this.getAge()+","+this.getSex());
	}
	@Override
	public void useCredit() {
	
	}
	public static void main(String[] args) {
		Student s=new Student("东软学院", "凯哥", "男", 10);
		s.study();
	}

}
