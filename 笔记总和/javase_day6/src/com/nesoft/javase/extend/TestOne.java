package com.nesoft.javase.extend;

public class TestOne {

	public static void main(String[] args) {
		Person p=new Person();
		p.age=90;
		p.name="zhangsan";
//		p.sex="男";
//		System.out.println()输出对象时,默认调用其toString方法
		System.out.println(p);
		p.sleep();
		
		GrandFather gf=new GrandFather();
		gf.address="nesoft";
//		gf.sex="男";
		gf.age=101;
		gf.name="王某林";
		gf.eat();
	
		System.out.println(gf);
		
		SonOne s1=new SonOne();
		s1.name="王jian林";
		s1.eat();
		s1.farming();
		s1.estate();
		
		SonTwo s2=new SonTwo();
		
		
				
				

	}

}
