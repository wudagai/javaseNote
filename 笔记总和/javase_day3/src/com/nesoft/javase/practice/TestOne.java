package com.nesoft.javase.practice;

import java.util.Random;
import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
		/*随机产生一个10以内的正整数，用户循环输入三个整数，如果用户输入的整数包含随机数，输出“猜对了”；反之，输出“没猜到”。
		例如：
		随机数为4，用户输入数为：2,3,4。输出：猜对了
		随机数为4，用户输入数为：1,2,3。输出：没猜到*/
		
		int randomMath=new Random().nextInt(10);
		int a=0;
		int b=0;
		int c=0;
		System.out.println(randomMath);
//		导包快捷键：ctrl+shift+o
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字：");
		/*for(int i=0;i<3;i++) {
			int a=sc.nextInt();
			if(a==randomMath) {
				System.out.println("猜对了");
			}else {
				System.out.println("猜错了");
			}
		}*/
		
		for(int i=0;i<3;i++) {
			switch(i) {
				case 0:
					a=sc.nextInt();
					break;
				case 1:
					b=sc.nextInt();
					break;
				case 2:
					c=sc.nextInt();
					break;
			}
		 }
		if(a==randomMath || b==randomMath || c==randomMath) {
			System.out.println("猜对了");
		}else {
			System.out.println("猜错了");
		}
		


	}

}
