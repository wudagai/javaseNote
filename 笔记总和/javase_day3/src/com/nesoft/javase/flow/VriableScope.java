package com.nesoft.javase.flow;

public class VriableScope{

	public static void main(String[] args) {
//		变量的作用域(变量的声明周期)   局部变量 :在某一作用域范围内起作用
//		变量只能在初始化之后使用。
//		在作用域里定义的变量，只能在该作用域中使用。
//		使用一对大括号包含的语句范围，称为作用域。
//		在作用域中，变量名不能重复定义。
		
		int a=10;
		System.out.println("a:"+a);
		if(a==2) {
			System.out.println("a:"+a);
		}
		if(true) {
			a=20;
			System.out.println("a:"+a);
//			int a=20; 在作用域中，变量名不能重复定义。
			int b=20;
//			int b=30;
		}else {
			int b=40;
		}
//		System.out.println("b:"+b); //在作用域里定义的变量，只能在该作用域中使用。
		int b=20;
		System.out.println("b:"+b); 
	}
	
	public void getAge() {
//		System.out.println(b);
	}

}
