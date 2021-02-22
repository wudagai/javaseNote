package com.nesoft.javase.encapsulation;

public class Test {

	public static void main(String[] args) {
		Emp e=new Emp();
//		e.age=700;
		e.setAge(700);
		System.out.println(e);
		System.out.println(e.getAge());
		
		Emp e1=new Emp();
		e1.setAge(20);
		System.out.println(e1);
		System.out.println(e1.getAge());
//		(int age, String name, String address)
		Emp e2=new Emp(40,"凯哥","东软");
		System.out.println(e2);
		
		Emp e3=new Emp();
		e3.setAddress("东软");
		e3.setAge(30);
		System.out.println(e3);
	}

}
