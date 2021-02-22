package com.nesoft.javase.practice;

import java.util.Scanner;

public class TestOne {
	public static void main(String[] args) {
//		1、编写一个程序，实现从命令行参数输入两个字符串类型的数值，并计算输出两个数值的和。 [必做题]
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输出第一个数：");
//		String messOne=sc.nextLine();
//		System.out.println("请输出第二个数：");
//		String messTwo=sc.nextLine();
//		int result=Integer.parseInt(messOne)+Integer.parseInt(messTwo);
//		System.out.println(result);
//		2、编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。（识点：String中常用的方法）
		Scanner sc=new Scanner(System.in);
		String messOne=sc.nextLine();//eeaaasadasdesadae
		int num=0;
//		for(int i=0;i<messOne.length();i++) {
//			if(messOne.charAt(i)=='e') {
//				num++;
//			}
//		}
//		System.out.println(num);
//		4、编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字母出现的次数。
//		System.out.println((char)97);
//		for(int i=0;i<messOne.length();i++) {
//		if((65<=messOne.charAt(i) && messOne.charAt(i)<=90) || (97<=messOne.charAt(i) && messOne.charAt(i)<=122)) {
//			num++;
//		}
//	    }
		for(int i=0;i<messOne.length();i++) {
			if(Character.isLetter(messOne.charAt(i))) {
				num++;
			}
		    }
		System.out.println(num);
	}

}
