package com.nesoft.javase.method;
/**
 * 值传递：
 * 	值传递（pass by value）是指在调用函数时将实际参数【复制】一份传递到函数中，
 * 	这样在函数中如果对参数进行修改，将不会影响到实际参数
 *引用传递（pass by reference）是指在调用函数时将实际参数的地址【直接】传递到函数中，
 *	那么在函数中对参数所进行的修改，将影响到实际参数。 
 * @author Administrator
 *
 */
public class MethodArgs {
	/**
	 * 
	 * @param x 基本数据类型
	 */
	public static void getX(int x) {
		x=x+10;
	}
	/**
	 * 
	 * @param y 引用数据类型
	 */
	public static void getY(int[] y) {
		y[0]=y[0]+10;
	}


	public static void main(String[] args) {
		int x=10;
		System.out.println("调用方法前："+x);//10
		getX(x);
		System.out.println("调用方法后："+x);//10
		int[] y= {10};
		System.out.println("调用方法前："+y[0]);//10
		getY(y);
		System.out.println("调用方法前："+y[0]);//20
		
	}

}
