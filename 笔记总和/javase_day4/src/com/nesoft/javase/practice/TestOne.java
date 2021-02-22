package com.nesoft.javase.practice;

import java.util.Scanner;

public class TestOne {
	public static void main(String[] args) {
//		8、输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句） [必做题]
		Scanner sc=new Scanner(System.in);
/*		System.out.println("请输入三个整数：");
		int x=sc.nextInt();//5
		int y=sc.nextInt();//3
		int z=sc.nextInt();//9
		int temp;
		if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}
		if(y>z) {
			temp=y;
			y=z;
			z=temp;
		}
		if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}
		System.out.println("从小大输出为："+ x+","+y+","+z);
		*/

//		9、有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。（知识点：条件语句） [必做题]
	/*	int a=sc.nextInt(); //54321  4321  321 21
		if(a/10000<10) {
			if(a/10000>0) {
				System.out.println("五位数");
			}else if(a/1000>0) {
				System.out.println("四位数");
			}else if(a/100>0) {
				System.out.println("三位数");
			}else if(a/10>0) {
				System.out.println("二位数");
			}else {
				System.out.println("个位数");
			}
		}else {
			System.out.println("输入的数多于5位");
		}*/
		
//		编写一个程序，找出小于300的所有质数(素数)[选做题 ]  只能被1和本身整除的数	 1既不是素数，也不是合数 2是素数
/*		for(int i=2;i<300;i++) {
//			一开始规定每个数都为素数
			boolean flag=true;
//			如果i为2输出i  因为2是素数
			if(i==2) {
				System.out.println(i);
				continue;
			}
			for(int j=2;j<i;j++) {
//				如果能被其他数整除,就不是素数
				if(i%j==0) {
					flag=false;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println(i);
			}
			
		}*/
		
		
		
//		7、编写一个程序，找出大于200的最小的质数(素数)[选做题 ]  只能被1和本身整除的数
		for(int i=200;i<300;i++) {
//			一开始规定每个数都为素数
			boolean flag=true;
			for(int j=2;j<i;j++) {
//				如果能被其他数整除,就不是素数
				if(i%j==0) {
					flag=false;
					break;
				}
				
			}
			if(flag) {
				System.out.println(i);
				break;
			}
			
		}




	}

}
