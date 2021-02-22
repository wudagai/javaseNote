package com.nesoft.javase.testobject;

public class Student extends Object{
	int age;

	public Student() {
		super();
	}
	public static void main(String[] args) {
		Student s=new Student();
	
	}
	
	@Override
	public boolean equals(Object obj) {
			if(this.hashCode()==obj.hashCode()) {
				if(this==obj) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
			
	}
	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}
	

}
