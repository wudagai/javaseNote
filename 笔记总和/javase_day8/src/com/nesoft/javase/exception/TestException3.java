package com.nesoft.javase.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestException3 {
	/**
	 * throws:作用在方法上，告诉下一个调用者需要处理的异常类型
	 * throws 异常类型
	 *   throws 后面能跟多个异常，中间用逗号隔开
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 * 
	 * throw:作用在方法内，抛出明确的异常
	 *  语法：
	 *  	throw new Throwable类型(包括子类)
	 * 注意：throw需要和try catch或者thows结合一起使用
	 */
	public static void getResult() throws IOException, ClassNotFoundException {
		File f=new File("D:/a.txt");
		f.createNewFile();
		Class.forName("student");
	}
	
	public static void testThrow(int i,int b) throws ClassNotFoundException {
		if(i!=b) {
			throw new ClassNotFoundException();//明确抛出异常类型
		}
	}
	
	public static void getName() throws IOException, ClassNotFoundException {
			getResult();
	}

	public static void main(String[] args) {
		/*try {
			getName();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		try {
			testThrow(2,2);
		} catch (ClassNotFoundException e) {
			System.out.println("两个值不相等");
		}
	}

}
