package com.nesoft.javase.singleInstance;

public class TestSingle {
	public static void main(String[] args) {
		Animal a1=Animal.getAnimalInstacne();
//		a1.age=20;
		System.out.println(a1);//@7852e922
//		System.out.println(a1.age);//20
		Animal a2=Animal.getAnimalInstacne();
		System.out.println(a2);//@7852e922
//		System.out.println(a2.age);//20

		
	}

}
