package com.nesoft.javase.method;

import java.util.Scanner;

public class MethodRecursive {
	public static int getResult(int a) {
		if(a==1) {
			return 1;
		}
		return a*getResult(a-1); // 5*4*3*2*1
		
	}

	public static void main(String[] args) {
//		使用方法的递归计算阶乘  5的阶乘 1*2*3*4*5 
		Scanner sc=new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
	}

}
