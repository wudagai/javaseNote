package com.nesoft.javase.practice;

import java.util.Scanner;

public class TestOne {
	public static void main(String[] args) {
		String s="zhangsan";
		System.out.println(s.substring(8));
		System.out.println(s.indexOf("z",8));
		
		
//		3、分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数。 [选做题]
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入源字符串：");
		String source=sc.nextLine();  // eqyueqiujeqipikkoeq
		System.out.println("请输入子字符串：");
		String dest=sc.nextLine();  //eq
//		int num=0;
//		int index=0;
//		for(int i=0;i<source.length();i++) {
//			if((index=source.indexOf(dest))!=-1) {
//				source=source.substring(index+dest.length());
//				num++;
//			}
//		}
//		System.out.println(num);
		int num=0;//统计
		int index=0;//开始查询的索引
		for(int i=0;i<source.length();i++) {
			if((index=source.indexOf(dest,index))!=-1) {
				num++;
				index=index+dest.length();
			}else {
				break;
			}
		}
		System.out.println(num);
		
	}

}
