package com.nesoft.javase.flow;

public class FlowWhile {
	public static void main(String[] args) {
//		while循环
		/**
		 * 语法：
		 * 	while(表达式A){	
		 * 		语句块B;
		 * 		循环终止操作;
		 * 	}
		 *  注意：表达式A返回值为boolean
		 *  如果表达式A为true执行B,直到A返回false终止循环
		 * 
		 */
//		循环一百次我爱你中国
		int i=0;
/*		while(i<100) {
			System.out.println("我爱你中国");
			i++;
		}*/
		
//		debug代码调试
//		int j=20;
//		int x=30;
//		int m=80;
//		System.out.println(j+x+m+i);
		
//		死循环
//		while(i==0) {
//			System.out.println("我爱你中国");
//		}
//		while(true) {
//			System.out.println("我爱你中国");
//		}
		
//		do while循环
		/**
		 * do{
		 *      语句块B
		 *   循环终止操作;   
		 * }while(表达式A)
		 * 
		 * 注意：语句块B无论如何都会执行一次
		 * 先执行语句块B,再执行A,如果A为true继续执行B,直到A返回false
		 */
		
//		do{
//			System.out.println("我爱你中国"+i);
//			i++;
//		}while(i<100);
		
//		死循环
		do{
		System.out.println("我爱你中国"+i);
		i++;
	  }while(true);
	

	}

}
