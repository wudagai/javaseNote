package com.nesoft.javase.polymorphism;

public class Test {
	public static void main(String[] args) {
//		客人要求打印彩色  public static void like(Print p)
		Print.like(new ColorPrint());//ColorPrint 向上转型为 Print
//		客人要求打印黑白
		Print.like(new BWPrint());
//		客人要求打印绿色
		Print.like(new GreenPrint());
		
	}
}
