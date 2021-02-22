package com.nesoft.javase.string;

public class TestString {
	public static void main(String[] args) {
//		只要是String类型，它们的值都存放在字符串常量池中
		String s1="zhangsan";
//		s1="lisi";
		System.out.println(s1.toString());
//		简单创建字符串的两种方式
		String s2="zhangsan"; //在字符串常量池中创建字符串对象
		System.out.println(s1==s2);//true
		//只创建了一个对象，先看字符串常量池中是否有指定的字符串，如果有就不需要在字符串常量池中创建对象，只在堆区中创建对象
		String s3=new String("zhangsan");
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		System.out.println(s3==s2);//false
		System.out.println(s3.equals(s2));//true
		
		String s4=new String("wangwu");//创建了两个对象
		String s5=new String("wangwu");//只创建了一个对象
		System.out.println(s4==s5);//false
		
		
		
	}

}
