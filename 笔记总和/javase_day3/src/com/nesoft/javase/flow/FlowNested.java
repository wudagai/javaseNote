package com.nesoft.javase.flow;

public class FlowNested {

	public static void main(String[] args) {
//		循环嵌套 ：循环中再嵌套循环
//		输出5次 10个我爱你中国
//	 for(int j=0;j<5;j++) {	
//		for(int i=0;i<10;i++) {
//			System.out.println("我爱你中国"+i);
//		}
//		System.out.println("--------------------");
//	 }
		
//		int j=0;
//		while(j<5) {
//			for(int i=0;i<10;i++) {
//			System.out.println("我爱你中国"+i);
//		    }
//			j++;
//			System.out.println("-----------------------------");
//		}
		
//		九九乘法表
/*		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		...*/
		
		/*for(int i=1;i<=9;i++) {
			System.out.println(1+"*"+i +"=" +(1*i));
		}*/
//		第一行：
//		for(int i=1;i<=1;i++) {
//			System.out.println(1+"*"+i +"=" +(1*i));
//		}
////		第二行：
//		for(int i=1;i<=2;i++) {
//			System.out.print(i+"*"+2 +"=" +(2*i)+" ");
//			
//		}
//		
		for(int i=1;i<=9;i++) { //行
			for(int j=1;j<=i;j++) { //列
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println("\n");//换行
			
		}

	}

}
