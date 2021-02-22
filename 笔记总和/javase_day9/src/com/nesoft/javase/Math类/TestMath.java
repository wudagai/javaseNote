package com.nesoft.javase.Math类;

import java.util.Random;

public class TestMath {
	public static void main(String[] args) {
//		Math类中封装了许多对数字进行操作的方法，都是静态方法
//		Math中的常量
		System.out.println(Math.PI);//3.141592653589793
		
//		static int abs(int)	返回参数的绝对值，返回值类型与参数类型相同
		double d=Math.abs(-90.0);
//		static double abs(double)	返回参数的绝对值
		
//		static double ceil(double)	返回大于所给参数的最小的整数值  向上求整
		System.out.println(Math.ceil(123.45));//124.0
//		static double floor(double)	返回不大于所给参数的最大的整数值  向下求整
		System.out.println(Math.floor(123.45));//123.0
//		static int   max(int a,int b)	返回两个int值中较大的一个
		System.out.println(Math.max(12,1));//12
//		static double max(double,double)	返回两个double值中较大的一个
//		static int min(int a,int b)	返回两个int值中较小的一个
		System.out.println(Math.min(12,1));//1
//		static double min(double,double)	返回两个double值中较小的一个
		

//		static double random( )	返回在0.0~1.0之间的随机的double值
		Random r=new Random();
		System.out.println(r.nextDouble());
		double d1=Math.random();
		System.out.println(d1);
//		返回12-27之间的整数   (27-12)*ii+12
		int ii=(int)(d1*15)+12; 
		System.out.println(ii);

//		static int round(double)	返回同所给值最接近的整数，采用4舍5入法
		System.out.println(Math.round(123.456));//123
		System.out.println(Math.round(123.556));//124
//		static double sin/cos/tan(double)	返回给定的弧度值对应的三角函数值
		System.out.println(Math.sin(Math.PI/2));//1.0
		System.out.println(Math.cos(0)); //1.0
		System.out.println(Math.tan(Math.PI));
		System.out.println(Math.sin(0));//0.0
		System.out.println(Math.sin(0));
		
//		static double sqrt(double) 	返回所给值的平方根，若所给值为负数则返回NaN
	}

}
