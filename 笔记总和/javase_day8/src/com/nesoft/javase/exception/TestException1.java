package com.nesoft.javase.exception;

import java.io.File;
import java.io.FileInputStream;

public class TestException1 {
//	运行时异常 RuntimeException  真正的bug，检查程序员水平的一个标准,需要程序员有对代码即将发生的错误有预见性，程序的健壮由程序员的水平决定
	/**
	 * 常见的运行时异常：
	 * 		 java.lang.ArrayIndexOutOfBoundsException: 索引越界异常
	 * 		 java.lang.NumberFormatException:  数字格式化异常，一般出现在数据类型转换时
	 * 		 java.lang.NullPointerException: 空指针异常
	 */
	public static void getRunException() {
		/*int[] arr= {1,2,3};
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}*/
		
		/*String name="zhangsan";
		if(false) {
			Integer.valueOf(name);// String --Integer
		}else {
			System.out.println("不是数字不能转换");
		}*/
		try {
		String name =null;
		/*if(name!=null) {
			name.charAt(3);
		}else {
			System.out.println("用户名为空");	
		}*/
		name.charAt(1);
		}catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		
	}
//	检查性异常
	/**
	 * 常见的检查性异常：
	 * 		ClassNotFoundException    类找不到异常
	 * 		FileNotFoundException     文件找不到异常
	 * 		IOException  :IO异常
	 * 		
	 */
	public static void getCheckException(){
		File file=new File("D:/x.txt");
//		FileInputStream in=new FileInputStream(file);
//		Class.forName("student");//将类加载进内存
		
	}
	
	public static void main(String[] args) {
		getRunException();
//		getCheckException();
	}

}
